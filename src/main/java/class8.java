import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class8 {

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
    public static int field144 = -1;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "Lvk;")
    public static class56 field145 = new class56(32);

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field149;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(BLjava/lang/Object;Lwd;)V")
    public static final void method61(byte arg0, Object arg1, class36 arg2) {
        field150++;
        if (arg2.field509 == null) {
            return;
        }
        if (arg0 != 87) {
            field145 = null;
        }
        for (int var3 = 0; var3 < 50 && arg2.field509.peekEvent() != null; var3++) {
            class144.method918(1L, true);
        }
        if (arg1 != null) {
            arg2.field509.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
    public static void method62(int arg0) {
        field145 = null;
        if (arg0 != 1) {
            field144 = -15;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B[[[Lgk;)V")
    public static final void method63(byte arg0, class254[][][] arg1) {
        if (arg0 != -48) {
            field145 = null;
        }
        for (int var2 = 0; var2 < arg1.length; var2++) {
            class254[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class254 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field3527 instanceof class425) {
                            ((class425) var6.field3527).method112((byte) -118);
                        }
                        if (var6.field3519 instanceof class425) {
                            ((class425) var6.field3519).method112((byte) -128);
                        }
                        if (var6.field3502 instanceof class425) {
                            ((class425) var6.field3502).method112((byte) -114);
                        }
                        if (var6.field3510 instanceof class425) {
                            ((class425) var6.field3510).method112((byte) -119);
                        }
                        if (var6.field3512 instanceof class425) {
                            ((class425) var6.field3512).method112((byte) -127);
                        }
                        for (class328 var7 = var6.field3515; var7 != null; var7 = var7.field4783) {
                            class55 var8 = var7.field4785;
                            if (var8 instanceof class425) {
                                ((class425) var8).method112((byte) -114);
                            }
                        }
                    }
                }
            }
        }
        field142++;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
    public class8() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IB)V")
    public static final void method64(int arg0, byte arg1) {
        field143++;
        if (arg1 >= 60) {
            class263 var2 = class47.method337(5, 0, arg0);
            var2.method1806(false);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "([BILnj;)V")
    public final void method65(byte[] arg0, int arg1, class228 arg2) {
        if (arg1 != 15049) {
            return;
        }
        field148++;
        if (arg2.field3040[arg2.field3029] != 31 || arg2.field3040[arg2.field3029 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field149 == null) {
            this.field149 = new Inflater(true);
        }
        try {
            this.field149.setInput(arg2.field3040, arg2.field3029 + 10, -arg2.field3029 - (18 - arg2.field3040.length));
            this.field149.inflate(arg0);
        } catch (Exception var4) {
            this.field149.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field149.reset();
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method66(int arg0, Component arg1) {
        field147++;
        arg1.removeMouseListener(class30.field430);
        arg1.removeMouseMotionListener(class30.field430);
        arg1.removeFocusListener(class30.field430);
        class271.field3936 = arg0;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(III)V")
    private class8(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)V")
    public static final void method67(int arg0, int arg1) {
        if (arg1 >= -8) {
            method63((byte) -30, (class254[][][]) null);
        }
        field146++;
        class263 var2 = class47.method337(12, 0, arg0);
        var2.method1806(false);
    }
}
