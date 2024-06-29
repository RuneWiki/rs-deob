import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class53 extends class7 {

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "I")
    public static int field1009 = 0;

    @OriginalMember(owner = "client!fb", name = "X", descriptor = "Lob;")
    private static class141 field1011 = class175.method1195(40, "You have only just left another world)3");

    @OriginalMember(owner = "client!fb", name = "ab", descriptor = "Lob;")
    public static class141 field1014 = class175.method1195(40, "compass");

    @OriginalMember(owner = "client!fb", name = "Z", descriptor = "Lob;")
    public static class141 field1013 = field1011;

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
    public static int field1008 = 0;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!fb", name = "W", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!fb", name = "Y", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!fb", name = "bb", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!fb", name = "cb", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!fb", name = "db", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILpe;I)Z")
    public static final boolean method353(int arg0, int arg1, class154 arg2, int arg3) {
        if (arg0 >= -84) {
            field1011 = null;
        }
        ++field1012;
        byte[] var4 = arg2.method1065((byte) 36, arg3, arg1);
        if (var4 == null) {
            return false;
        } else {
            class11.method75(var4, (byte) -69);
            return true;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(BII)I")
    private final int method354(byte arg0, int arg1, int arg2) {
        if (arg0 <= 114) {
            return -18;
        } else {
            ++field1016;
            int var4 = arg1 * 57 + arg2;
            int var5 = var4 ^ var4 << 1;
            return 4096 - (Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144;
        }
    }

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "(I)V")
    public static void method355(int arg0) {
        field1011 = null;
        if (arg0 > -76) {
            field1013 = null;
        }
        field1014 = null;
        field1013 = null;
    }

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "(I)V")
    public static final void method356(int arg0) {
        ++field1007;
        if (arg0 != -630) {
            method358(-8, -121);
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; ~var2 > ~(class188.field3637 + -1); ++var2) {
                if (class157.field3026[var2] < 1000 && ~class157.field3026[var2 - -1] < -1001) {
                    class141 var3 = class223.field4210[var2];
                    class223.field4210[var2] = class223.field4210[var2 + 1];
                    class223.field4210[var2 - -1] = var3;
                    var1 = false;
                    class141 var4 = class22.field396[var2];
                    class22.field396[var2] = class22.field396[var2 + 1];
                    class22.field396[var2 + 1] = var4;
                    int var5 = class6.field76[var2];
                    class6.field76[var2] = class6.field76[var2 + 1];
                    class6.field76[var2 - -1] = var5;
                    int var6 = class133.field2529[var2];
                    class133.field2529[var2] = class133.field2529[var2 - -1];
                    class133.field2529[var2 + 1] = var6;
                    short var7 = class157.field3026[var2];
                    class157.field3026[var2] = class157.field3026[var2 + 1];
                    class157.field3026[var2 + 1] = var7;
                    long var8 = class161.field3123[var2];
                    class161.field3123[var2] = class161.field3123[var2 - -1];
                    class161.field3123[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        ++field1015;
        if (arg0 <= 13) {
            return null;
        } else {
            int[] var3 = super.field100.method842(arg1, 12);
            if (super.field100.field2534) {
                int var4 = class177.field3503[arg1];
                for (int var5 = 0; var5 < class117.field2272; ++var5) {
                    var3[var5] = this.method354((byte) 123, var4, class15.field272[var5]) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZLob;)V")
    public static final void method357(int arg0, boolean arg1, class141 arg2) {
        byte var3 = 4;
        ++field1017;
        if (arg0 != -31122) {
            method355(14);
        }
        int var4 = var3 + 6;
        int var5 = class125.field2409.method877(arg2, 250);
        int var6 = var3 + 6;
        int var7 = class125.field2409.method859(arg2, 250) * 13;
        class148.method1030(-var3 + var6, -var3 + var4, var3 + var5 + var3, var3 + var7 + var3, 0);
        class148.method1021(-var3 + var6, -var3 + var4, var5 - (-var3 - var3), var7 - (-var3 - var3), 16777215);
        class125.field2409.method871(arg2, var6, var4, var5, var7, 16777215, -1, 1, 1, 0);
        class143.method944(-var3 + var4, var6 - var3, var3 + var5 - -var3, var3 + var7 + var3, arg0 ^ -31124);
        if (!arg1) {
            class172.method1184(false, var7, var5, var6, var4);
        } else {
            try {
                Graphics var8 = class176.field3488.getGraphics();
                class219.field4149.method655(0, var8, 0, -62);
            } catch (Exception var9) {
                class176.field3488.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
    public class53() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(II)I")
    public static final int method358(int arg0, int arg1) {
        if (arg1 != 127) {
            method358(-120, -116);
        }
        ++field1005;
        return 127 & arg0;
    }
}
