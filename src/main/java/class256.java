import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class256 {

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    private int field3471 = 0;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    private int field3468 = -1;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "Loe;")
    private class183 field3473 = new class183();

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "Z")
    public boolean field3482 = false;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    private int field3480;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    private int field3478;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "[Lce;")
    private class281[] field3466;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "[[I")
    private int[][] field3474;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "Lwo;")
    public static class690 field3479 = new class690(13, 1);

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "Z")
    public static boolean field3481 = false;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "Ljn;")
    public static class668 field3472;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static void method1558(int arg0) {
        field3479 = null;
        if (arg0 != -30234) {
            method1560(null, false);
        }
        field3472 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;ZBLjava/lang/String;)V")
    public static final void method1559(String arg0, boolean arg1, byte arg2, String arg3) {
        field3469++;
        class168.field2052 = arg1;
        if (arg2 != 23) {
            method1560(null, false);
        }
        class468.field6540 = arg3;
        class422.field6010 = arg0;
        if (!class168.field2052 && class611.field8763 != 3 && class468.field6540.equals("") || class422.field6010.equals("")) {
            class676.method3841(3, -36);
            return;
        }
        if (class611.field8763 != 1) {
            class367.field4942 = -1;
            class285.field3864 = 0;
        }
        class52.field847 = false;
        class676.method3841(-3, -101);
        class690.field9842 = 1;
        class441.field6295 = 0;
        class31.field640 = 0;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Component;Z)Lle;")
    public static final class280 method1560(Component arg0, boolean arg1) {
        field3476++;
        return arg1 ? null : new class423(arg0);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;B)V")
    public static final void method1561(boolean arg0, int arg1, String arg2, String arg3, byte arg4) {
        field3470++;
        class378.method2196((byte) 127, true, arg3, arg0, arg1, arg2, -1);
        if (arg4 >= -126) {
            method1559(null, false, (byte) -76, null);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
    public final void method1562(boolean arg0) {
        if (arg0) {
            return;
        }
        field3475++;
        for (int var2 = 0; var2 < this.field3478; var2++) {
            this.field3474[var2] = null;
        }
        this.field3474 = null;
        this.field3466 = null;
        this.field3473.method1131((byte) -65);
        this.field3473 = null;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)[[I")
    public final int[][] method1563(int arg0) {
        field3477++;
        if (arg0 != -2) {
            this.field3471 = -2;
        }
        if (this.field3480 != this.field3478) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field3478; var2++) {
            this.field3466[var2] = class412.field5853;
        }
        return this.field3474;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)[I")
    public final int[] method1564(int arg0, boolean arg1) {
        field3467++;
        if (!arg1) {
            return null;
        } else if (this.field3480 == this.field3478) {
            this.field3482 = this.field3466[arg0] == null;
            this.field3466[arg0] = class412.field5853;
            return this.field3474[arg0];
        } else if (this.field3478 == 1) {
            this.field3482 = this.field3468 != arg0;
            this.field3468 = arg0;
            return this.field3474[0];
        } else {
            class281 var3 = this.field3466[arg0];
            if (var3 == null) {
                this.field3482 = true;
                if (this.field3471 >= this.field3478) {
                    class281 var4 = (class281) this.field3473.method1140(262144);
                    var3 = new class281(arg0, var4.field3809);
                    this.field3466[var4.field3807] = null;
                    var4.method3045(true);
                } else {
                    var3 = new class281(arg0, this.field3471);
                    this.field3471++;
                }
                this.field3466[arg0] = var3;
            } else {
                this.field3482 = false;
            }
            this.field3473.method1133(var3, 24);
            return this.field3474[var3.field3809];
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(III)V")
    public class256(int arg0, int arg1, int arg2) {
        this.field3480 = arg1;
        this.field3478 = arg0;
        this.field3466 = new class281[this.field3480];
        this.field3474 = new int[this.field3478][arg2];
    }
}
