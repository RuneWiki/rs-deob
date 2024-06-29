import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class131 {

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "[I")
    public static int[] field1804 = new int[4096];

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1794 = new CRC32();

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "[I")
    public static int[] field1805 = new int[50];

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public int field1798;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "Ldg;")
    public class131 field1796;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "Lwt;")
    public class325 field1803;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lvh;II)Z", line = 5)
    public static final boolean method977(class84 arg0, int arg1, int arg2) {
        field1800++;
        int var3 = arg0.method712(false, 2);
        if (var3 == 0) {
            if (arg0.method712(false, 1) != 0) {
                method977(arg0, arg1, -8);
            }
            int var4 = arg0.method712(false, 6);
            int var5 = arg0.method712(false, 6);
            boolean var6 = arg0.method712(false, 1) == 1;
            if (var6) {
                class441.field6265[class163.field2372++] = arg1;
            }
            if (class112.field1570[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class39 var7 = class112.field1570[arg1] = new class39();
            var7.field5751 = arg1;
            if (class141.field1970[arg1] != null) {
                var7.method247(class141.field1970[arg1], (byte) 70);
            }
            var7.method2499((byte) -29, class389.field5382[arg1]);
            var7.field5748 = class317.field4463[arg1];
            int var8 = class320.field4514[arg1];
            int var9 = var8 >> 28;
            int var10 = (var8 & 0x3FC815) >> 14;
            int var11 = var8 & 0xFF;
            var7.field5808[0] = class418.field5783[arg1];
            var7.field4531 = (byte) var9;
            var7.method242((var11 << 6) + var5 - class189.field2810, -57, (var10 << 6) + var4 - class279.field4012);
            var7.field500 = -1;
            return true;
        } else if (var3 == 1) {
            int var12 = arg0.method712(false, 2);
            int var13 = class320.field4514[arg1];
            class320.field4514[arg1] = class88.method739(805306368, (var13 >> 28) + var12 << 28) + class88.method739(var13, 268435455);
            return false;
        } else if (var3 == 2) {
            int var14 = arg0.method712(false, 5);
            int var15 = var14 >> 3;
            int var16 = var14 & 0x7;
            int var17 = class320.field4514[arg1];
            int var18 = (var17 >> 28) + var15 & 0x3;
            int var19 = var17 >> 14 & 0xFF;
            int var20 = var17 & 0xFF;
            if (var16 == 0) {
                var20--;
                var19--;
            }
            if (var16 == 1) {
                var20--;
            }
            if (var16 == 2) {
                var20--;
                var19++;
            }
            if (var16 == 3) {
                var19--;
            }
            if (var16 == 4) {
                var19++;
            }
            if (var16 == 5) {
                var19--;
                var20++;
            }
            if (var16 == 6) {
                var20++;
            }
            if (var16 == 7) {
                var20++;
                var19++;
            }
            class320.field4514[arg1] = (var18 << 28) + (var19 << 14) + var20;
            return false;
        } else {
            int var21 = arg0.method712(false, 18);
            if (arg2 != -8) {
                return false;
            }
            int var22 = var21 >> 16;
            int var23 = var21 >> 8 & 0xFF;
            int var24 = var21 & 0xFF;
            int var25 = class320.field4514[arg1];
            int var26 = (var25 >> 28) + var22 & 0x3;
            int var27 = (var25 >> 14) + var23 & 0xFF;
            int var28 = var24 + var25 & 0xFF;
            class320.field4514[arg1] = (var26 << 28) + ((var27 << 14) + var28);
            return false;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 160)
    public static final void method978(int arg0) {
        int var1 = -11 % ((arg0 - 3) / 36);
        field1795++;
        class266.field3835.method415(((float) class172.field2621 * 0.1F + 0.7F) * class352.field4845);
        class266.field3835.method420(class249.field3595, class491.field6929, class174.field2653, (float) class190.field2851, (float) class254.field3649, (float) class15.field147);
        class266.field3835.method446(class31.field331);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V", line = 172)
    public final void method979(byte arg0) {
        field1802++;
        if (arg0 != 58) {
            this.field1803 = null;
        }
        if (class200.field2972 >= 500) {
            return;
        }
        this.field1803 = null;
        this.field1798 = 0;
        this.field1796 = class163.field2379;
        class163.field2379 = this;
        class200.field2972++;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)Z", line = 190)
    public static final boolean method980(int arg0) {
        if (arg0 > -21) {
            return false;
        }
        field1797++;
        try {
            if (class347.field4785 == 2) {
                if (class96.field1344 == null) {
                    class96.field1344 = class463.method2767(class26.field278, class56.field829, class363.field5004);
                    if (class96.field1344 == null) {
                        return false;
                    }
                }
                if (class93.field1308 == null) {
                    class93.field1308 = new class312(class95.field1342, class238.field3487);
                }
                if (class264.field3811.method2594(22050, -846, class181.field2732, class93.field1308, class96.field1344)) {
                    class264.field3811.method2599((byte) -49);
                    class264.field3811.method2611(-116, class33.field342);
                    class264.field3811.method2614(class96.field1344, false, class353.field4855);
                    class96.field1344 = null;
                    class93.field1308 = null;
                    class26.field278 = null;
                    class347.field4785 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class264.field3811.method2613((byte) 116);
            class93.field1308 = null;
            class347.field4785 = 0;
            class26.field278 = null;
            class96.field1344 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V", line = 248)
    public static void method981(int arg0) {
        field1804 = null;
        field1794 = null;
        if (arg0 <= 106) {
            field1794 = null;
        }
        field1805 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIZ)V", line = 263)
    public static final void method982(int arg0, int arg1, boolean arg2) {
        field1801++;
        class48 var3 = class317.method2019((byte) -109, arg1, arg2);
        if (var3 != null) {
            if (arg0 != 5) {
                field1805 = null;
            }
            var3.method2714(-109);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;", line = 280)
    public static final Object method983(boolean arg0, byte[] arg1, int arg2) {
        field1799++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class77.field1141) {
            try {
                class66 var3 = (class66) Class.forName("gr").getDeclaredConstructor().newInstance();
                var3.method621(arg1, (byte) 125);
                return var3;
            } catch (Throwable var4) {
                class77.field1141 = true;
            }
        }
        if (arg2 != 23543) {
            method982(-74, -22, false);
        }
        return arg0 ? class93.method781(arg2 - 55191, arg1) : arg1;
    }
}
