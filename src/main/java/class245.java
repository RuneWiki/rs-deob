import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public abstract class class245 extends class312 {

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "Z")
    public static volatile boolean field3840 = true;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "Ljava/lang/String;")
    public static String field3848 = "flash3:";

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "Leg;")
    public static class188 field3850 = new class188(5);

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field3851 = new String[8];

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "[I")
    public static int[] field3853 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "Z")
    public static boolean field3854 = false;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    public int field3841;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    public int field3842;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
    public int field3844;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
    public int field3846;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
    public int field3847;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "I")
    public int field3849;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "Lwf;")
    public static class306 field3852;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(III)Llg;", line = 28)
    public static final class123 method1658(int arg0, int arg1, int arg2) {
        class174 var3 = class90.field1375[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class123 var4 = var3.field2656;
            var3.field2656 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(Z)V", line = 40)
    public static void method1659(boolean arg0) {
        field3853 = null;
        field3850 = null;
        if (arg0) {
            field3848 = (String) null;
        }
        field3848 = null;
        field3851 = null;
        field3852 = null;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(IIIII)V", line = 60)
    public final void method1660(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3845++;
        int var6 = this.field3849 << 3;
        int var7 = this.field3842 << 3;
        int var8 = (arg2 << 4) + (var6 & 0xF);
        if (arg3 == -9806) {
            int var9 = (arg0 << 4) + (var7 & 0xF);
            this.method912(var6, var7, var8, var9, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)Z", line = 82)
    public static final boolean method1661(int arg0) {
        if (arg0 != 9066) {
            method1661(31);
        }
        field3843++;
        if (class242.field3831) {
            try {
                class254.method1715("showVideoAd", (byte) -88, class89.field1359.field3569);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIII)V")
    public abstract void method912(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(IIIII)V")
    public abstract void method925(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
    public abstract void method917(int arg0, int arg1);

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)V")
    public abstract void method921(int arg0, int arg1);

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(II)V")
    public abstract void method920(int arg0, int arg1);

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(III)V")
    public abstract void method913(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)V")
    public abstract void method919(int arg0, int arg1, int arg2, int arg3);
}
