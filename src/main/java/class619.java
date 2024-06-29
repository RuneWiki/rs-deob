import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public abstract class class619 extends class71 {

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "Ljagtheora/ogg/OggStreamState;")
    public OggStreamState field8305;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "Lkr;")
    public static class602 field8308 = new class602(119, 7);

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    public static int field8303;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public static int field8304;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public int field8306;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
    public static int field8307;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    public static int field8309;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "()V")
    public static final void method3494() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class280.field4069.length; var1++) {
                if (class280.field4069[var1].method632()) {
                    class667.field9196[var1] = class280.field4069[var1].method634();
                } else {
                    synchronized (class280.field4069[var1]) {
                        class280.field4069[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class280.field4069[class280.field4069.length - 1].method631();
                class260.method1758(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class280.field4069.length - 1; var4++) {
                        if (!class280.field4069[var4].method632()) {
                            synchronized (class280.field4069[var4]) {
                                class280.field4069[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class280.field4069.length - 2; var6++) {
                            class280.field4069[var6].method631();
                        }
                        class260.method1758(2);
                        while (!class280.field4069[0].method632()) {
                            synchronized (class280.field4069[0]) {
                                class280.field4069[0].notify();
                            }
                            try {
                                class688.method3874(1L, -7375);
                            } catch (Exception var9) {
                            }
                        }
                        class280.field4069[0].method631();
                        return;
                    }
                    try {
                        class688.method3874(1L, -7375);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class688.method3874(1L, -7375);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
    public abstract void method804(byte arg0);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
    public static void method3495(int arg0) {
        if (arg0 != 0) {
            method3494();
        }
        field8308 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3496(int arg0, byte arg1, int arg2) {
        field8304++;
        if (arg1 <= 108) {
            return true;
        } else {
            return class8.method44(false, arg0, arg2) || class286.method1899((byte) -124, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIBII)I")
    public static final int method3497(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        int var7 = arg3 & 0x3;
        if ((arg0 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg6;
            arg6 = var8;
        }
        if (arg4 != 27) {
            method3494();
        }
        field8303++;
        if (var7 == 0) {
            return arg2;
        } else if (var7 == 1) {
            return -arg5 - (-(7 - arg1) - 1);
        } else if (var7 == 2) {
            return 1 + 7 - arg6 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class619(OggStreamState arg0) {
        this.field8305 = arg0;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V")
    public final void method3498(OggPacket arg0, int arg1) {
        if (arg1 < 61) {
            field8309 = 91;
        }
        field8307++;
        this.method799(arg0, 16);
        this.field8306++;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(Ljagtheora/ogg/OggPacket;I)V")
    public abstract void method799(OggPacket arg0, int arg1);
}
