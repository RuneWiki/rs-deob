import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class137 {

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "[I")
    public static int[] field2642 = new int[128];

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "Lqh;")
    public static class69 field2646 = null;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public static int field2651 = 0;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "Lhh;")
    private static class163 field2653 = method1065("Select a world", 17);

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Lhh;")
    public static class163 field2643 = field2653;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "J")
    public long field2641;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "Lsa;")
    public class137 field2645;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Lsa;")
    public class137 field2648;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)Lqh;")
    public static final class69 method1062(int arg0, int arg1, int arg2) {
        field2649++;
        if (arg1 != 1) {
            return null;
        }
        class69 var3 = class124.method989((byte) 114, arg2);
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field1291 == null || var3.field1291.length <= arg0) {
            return null;
        } else {
            return var3.field1291[arg0];
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public final void method1063(int arg0) {
        field2644++;
        if (this.field2648 == null) {
            return;
        }
        this.field2648.field2645 = this.field2645;
        this.field2645.field2648 = this.field2648;
        if (arg0 < 69) {
            field2653 = null;
        }
        this.field2645 = null;
        this.field2648 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public static void method1064(byte arg0) {
        field2653 = null;
        if (arg0 == -22) {
            field2642 = null;
            field2643 = null;
            field2646 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;I)Lhh;")
    public static final class163 method1065(String arg0, int arg1) {
        if (arg1 != 17) {
            return null;
        }
        field2650++;
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        class163 var4 = new class163();
        int var5 = 0;
        var4.field3020 = new byte[var3];
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var5) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field3020[var4.field2990++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field3020[var4.field2990++] = (byte) var6;
            }
        }
        var4.method1187((byte) 98);
        return var4.method1230((byte) 88);
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V")
    public static final void method1066(byte arg0) {
        field2647++;
        if (class23.field380 != null || class109.field2063 != null) {
            return;
        }
        int var1 = class31.field489;
        int var2 = 63 / ((arg0 - 46) / 60);
        if (class130.field2530) {
            if (var1 != 1) {
                int var7 = class36.field608;
                int var8 = class240.field4281;
                if (var7 < (class190.field3484 - 10) || class190.field3484 + class153.field2867 + 10 < var7 || (class14.field221 - 10) > var8 || (class14.field221 - (-class239.field4247 - 10)) < var8) {
                    class130.field2530 = false;
                    class89.method690(class190.field3484, class239.field4247, class153.field2867, 0, class14.field221);
                }
            }
            if (var1 != 1) {
                return;
            }
            int var9 = class190.field3484;
            int var10 = class153.field2867;
            int var11 = class84.field1598;
            int var12 = class14.field221;
            int var13 = class265.field4604;
            int var14 = -1;
            for (int var15 = 0; var15 < class202.field3647; var15++) {
                int var16 = (class202.field3647 - var15 - 1) * 15 + var12 + 31;
                if (var9 < var11 && var11 < (var9 + var10) && (var16 - 13) < var13 && var16 + 3 > var13) {
                    var14 = var15;
                }
            }
            if (var14 != -1) {
                class161.method1177(var14, 0);
            }
            class130.field2530 = false;
            class89.method690(class190.field3484, class239.field4247, class153.field2867, 0, class14.field221);
            return;
        }
        if (var1 == 1 && class202.field3647 > 0) {
            short var3 = class4.field76[class202.field3647 - 1];
            if (var3 == 20 || var3 == 14 || var3 == 37 || var3 == 51 || var3 == 31 || var3 == 36 || var3 == 30 || var3 == 9 || var3 == 12 || var3 == 42 || var3 == 17 || var3 == 1004) {
                int var4 = class23.field375[class202.field3647 - 1];
                int var5 = class213.field3882[class202.field3647 - 1];
                class69 var6 = class124.method989((byte) 113, var5);
                if (class264.method1784(0, client.method826(var6)) || class123.method979(client.method826(var6), 1)) {
                    class49.field823 = 0;
                    class201.field3601 = false;
                    if (class23.field380 != null) {
                        class213.method1517((byte) 11, class23.field380);
                    }
                    class23.field380 = class124.method989((byte) 109, var5);
                    class141.field2689 = class84.field1598;
                    class59.field971 = var4;
                    class66.field1115 = class265.field4604;
                    class213.method1517((byte) 11, class23.field380);
                    return;
                }
            }
        }
        if (var1 == 1 && (class221.field4017 == 1 && class202.field3647 > 2 || class170.method1264(class202.field3647 - 1, 110))) {
            var1 = 2;
        }
        if (var1 == 1 && class202.field3647 > 0) {
            class161.method1177(class202.field3647 - 1, 0);
        }
        if (var1 == 2 && class202.field3647 > 0) {
            class33.method195((byte) 119);
            return;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)Z")
    public final boolean method1067(int arg0) {
        if (arg0 > -15) {
            this.field2641 = 21L;
        }
        field2652++;
        return this.field2648 != null;
    }
}
