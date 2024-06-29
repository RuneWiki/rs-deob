import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class291 {

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "Z")
    public boolean field4822 = false;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public int field4826 = 0;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public int field4832 = 0;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field4825 = 0;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field4823 = 0;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "[Lsj;")
    public static class213[] field4830 = new class213[29];

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    public static int field4836 = -1;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "Z")
    public static boolean field4831 = false;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "Z")
    public static boolean field4838 = false;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "Lon;")
    public static class151 field4828;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "Lvj;")
    public class205 field4821;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "Lnm;")
    public static class221 field4827;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field4824;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V", line = 7)
    public static void method2058(int arg0) {
        if (arg0 == -15977) {
            field4827 = null;
            field4830 = null;
            field4828 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZIIIIIIII)V", line = 33)
    public static final void method2059(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4835++;
        if (class31.method266(arg6, 1)) {
            class70.method486(arg5, arg1, arg8, -1, arg7, arg3, (byte) -89, class167.field2627[arg6], arg4, arg2);
            if (!arg0) {
                method2058(-28);
            }
        } else if (arg2 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class116.field1694[var9] = true;
            }
        } else {
            class116.field1694[arg2] = true;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BJ)V", line = 71)
    public static final void method2060(byte arg0, long arg1) {
        field4833++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 != 52) {
            field4828 = (class151) null;
        }
        class276.field4553++;
        class195.field2992.method250(arg0 + 21014, 134);
        class195.field2992.method2228(arg1, true);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V", line = 89)
    public static final void method2061(int arg0) {
        if (class248.field3943 == null || class18.field225 == null) {
            class18.field225 = new int[256];
            class248.field3943 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class248.field3943[var1] = (int) (Math.sin(var2) * 4096.0D);
                class18.field225[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 != 0) {
            method2060((byte) 103, -11L);
        }
        field4829++;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILto;)V", line = 135)
    public static final void method2062(int arg0, class5 arg1) {
        class138.field2182 = arg1;
        field4820++;
        if (arg0 != 0) {
            method2060((byte) -58, -30L);
        }
    }
}
