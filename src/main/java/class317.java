import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class317 extends class192 {

    @OriginalMember(owner = "client!jk", name = "B", descriptor = "I")
    private int field5334 = 0;

    @OriginalMember(owner = "client!jk", name = "C", descriptor = "I")
    private int field5335 = -1;

    @OriginalMember(owner = "client!jk", name = "I", descriptor = "I")
    private int field5341;

    @OriginalMember(owner = "client!jk", name = "E", descriptor = "Loh;")
    public static class258 field5337 = class153.method1046("Abbrechen", 113);

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "Loh;")
    private static class258 field5343 = class153.method1046("Loading fonts )2 ", 99);

    @OriginalMember(owner = "client!jk", name = "L", descriptor = "Loh;")
    public static class258 field5344 = field5343;

    @OriginalMember(owner = "client!jk", name = "H", descriptor = "Loh;")
    public static class258 field5340 = class153.method1046("leuchten2:", 98);

    @OriginalMember(owner = "client!jk", name = "M", descriptor = "I")
    public static int field5345 = 127;

    @OriginalMember(owner = "client!jk", name = "R", descriptor = "Loh;")
    public static class258 field5350 = class153.method1046("huffman", 127);

    @OriginalMember(owner = "client!jk", name = "D", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!jk", name = "F", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!jk", name = "G", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!jk", name = "Q", descriptor = "Lam;")
    public static class137 field5349;

    @OriginalMember(owner = "client!jk", name = "S", descriptor = "[Lkl;")
    public static class65[] field5351;

    @OriginalMember(owner = "client!jk", name = "finalize", descriptor = "()V", line = 20)
    protected final void finalize() throws Throwable {
        if (this.field5335 != -1) {
            class196.method1315(this.field5335, this.field5334, this.field5341);
            this.field5335 = -1;
            this.field5334 = 0;
        }
        super.finalize();
        field5347++;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(I)V", line = 705)
    public class317(int arg0) {
        int[] var2 = new int[1];
        GL var3 = class257.field4409;
        var3.glGenTextures(1, var2, 0);
        this.field5335 = var2[0];
        this.field5341 = class196.field3439;
        class257.method1736(this.field5335);
        int var4 = class266.field4634[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var3.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var3.glTexParameteri(3553, 10241, 9729);
        var3.glTexParameteri(3553, 10240, 9729);
        class196.field3442 += var6.limit() - this.field5334;
        this.field5334 = var6.limit();
    }

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "(B)V", line = 48)
    public static final void method2177(byte arg0) {
        field5338++;
        class159.method1075((byte) -116, false);
        class260.field4522 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class191.field3383.length; var2++) {
            if (class268.field4668[var2] != -1 && class191.field3383[var2] == null) {
                class191.field3383[var2] = class114.field2011.method1453(class268.field4668[var2], (byte) -43, 0);
                if (class191.field3383[var2] == null) {
                    class260.field4522++;
                    var1 = false;
                }
            }
            if (class276.field4764[var2] != -1 && class146.field2482[var2] == null) {
                class146.field2482[var2] = class114.field2011.method1427(0, -68, class1.field8[var2], class276.field4764[var2]);
                if (class146.field2482[var2] == null) {
                    class260.field4522++;
                    var1 = false;
                }
            }
            if (class257.field4390) {
                if (class144.field2427[var2] != -1 && class132.field2302[var2] == null) {
                    class132.field2302[var2] = class114.field2011.method1453(class144.field2427[var2], (byte) -69, 0);
                    if (class132.field2302[var2] == null) {
                        var1 = false;
                        class260.field4522++;
                    }
                }
                if (class243.field4217[var2] != -1 && class58.field925[var2] == null) {
                    class58.field925[var2] = class114.field2011.method1453(class243.field4217[var2], (byte) -59, 0);
                    if (class58.field925[var2] == null) {
                        var1 = false;
                        class260.field4522++;
                    }
                }
            }
            if (class32.field383 != null && class84.field1427[var2] == null && class32.field383[var2] != -1) {
                class84.field1427[var2] = class114.field2011.method1427(0, -128, class1.field8[var2], class32.field383[var2]);
                if (class84.field1427[var2] == null) {
                    var1 = false;
                    class260.field4522++;
                }
            }
        }
        if (class2.field22 == null) {
            if (class153.field2632 == null || !class312.field5297.method1445(124, class100.method755(-6, new class258[] { class153.field2632.field2228, class284.field4867 }))) {
                class2.field22 = new class225(0);
            } else if (class312.field5297.method1424(class100.method755(-6, new class258[] { class153.field2632.field2228, class284.field4867 }), -68)) {
                class2.field22 = class170.method1126(class312.field5297, class100.method755(-6, new class258[] { class153.field2632.field2228, class284.field4867 }), false);
            } else {
                var1 = false;
                class260.field4522++;
            }
        }
        if (!var1) {
            class166.field2813 = 1;
            return;
        }
        boolean var3 = true;
        class114.field1995 = 0;
        for (int var4 = 0; var4 < class191.field3383.length; var4++) {
            byte[] var5 = class146.field2482[var4];
            if (var5 != null) {
                int var6 = (class231.field3990[var4] >> 8) * 64 - class229.field3955;
                int var7 = (class231.field3990[var4] & 0xFF) * 64 - class311.field5271;
                if (class11.field142) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class20.method133(var5, var6, var7, false);
            }
            if (class257.field4390) {
                byte[] var8 = class58.field925[var4];
                if (var8 != null) {
                    int var9 = (class231.field3990[var4] >> 8) * 64 - class229.field3955;
                    int var10 = (class231.field3990[var4] & 0xFF) * 64 - class311.field5271;
                    if (class11.field142) {
                        var10 = 10;
                        var9 = 10;
                    }
                    var3 &= class20.method133(var8, var9, var10, false);
                }
            }
        }
        if (!var3) {
            class166.field2813 = 2;
            return;
        }
        if (class166.field2813 != 0) {
            class251.method1704(class100.method755(-6, new class258[] { class282.field4853, class311.field5279 }), true, false);
        }
        class172.method1164(110);
        class182.method1242(0);
        boolean var11 = false;
        if (class257.field4390 && class20.field239) {
            for (int var12 = 0; var12 < class191.field3383.length; var12++) {
                if (class58.field925[var12] != null || class132.field2302[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class65.method501(4, 104, 104, class257.field4390 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class243.field4216[var13].method1673((byte) -72);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class94.field1653[var14][var15][var16] = 0;
                }
            }
        }
        class82.method597(6, false);
        if (class257.field4390) {
            class9.field110.method928();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class9.field113[var17][var18].field566 = true;
                }
            }
        }
        if (class257.field4390) {
            class267.method1884();
        }
        if (class257.field4390) {
            class237.method1632((byte) -120);
        }
        class172.method1164(77);
        System.gc();
        class159.method1075((byte) -116, true);
        client.method353(false, 105);
        if (!class11.field142) {
            class232.method1552(false, -12695);
            class159.method1075((byte) -116, true);
            if (class257.field4390) {
                int var19 = class152.field2606.field975[0] >> 3;
                int var20 = class152.field2606.field959[0] >> 3;
                class251.method1701(false, var19, var20);
            }
            class287.method2020((byte) 20, false);
            if (class84.field1427 != null) {
                class251.method1702(64);
            }
        }
        if (class11.field142) {
            class207.method1370(false, (byte) -64);
            class159.method1075((byte) -116, true);
            if (class257.field4390) {
                int var21 = class152.field2606.field975[0] >> 3;
                int var22 = class152.field2606.field959[0] >> 3;
                class251.method1701(false, var21, var22);
            }
            class79.method567(8, false);
        }
        class182.method1242(0);
        class159.method1075((byte) -116, true);
        class203.method1353(class243.field4216, false, 0);
        if (class257.field4390) {
            class267.method1882();
        }
        class159.method1075((byte) -116, true);
        int var23 = class263.field4583;
        if (var23 > class272.field4704) {
            var23 = class272.field4704;
        }
        if ((class272.field4704 - 1) > var23) {
            int var24 = class272.field4704 - 1;
        }
        if (class110.method807(720049666)) {
            class26.method199(0);
        } else {
            class26.method199(class263.field4583);
        }
        class190.method1284(17908);
        if (class257.field4390 && var11) {
            class75.method549(true);
            client.method353(true, 105);
            if (!class11.field142) {
                class232.method1552(true, -12695);
                class159.method1075((byte) -116, true);
                class287.method2020((byte) 46, true);
            }
            if (class11.field142) {
                class207.method1370(true, (byte) -64);
                class159.method1075((byte) -116, true);
                class79.method567(8, true);
            }
            class182.method1242(0);
            class159.method1075((byte) -116, true);
            class203.method1353(class243.field4216, true, 0);
            class159.method1075((byte) -116, true);
            class190.method1284(17908);
            class75.method549(false);
        }
        if (class257.field4390) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class9.field113[var25][var26].method311(class201.field3482[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class259.method1827(var27, (byte) 77, var28);
            }
        }
        if (arg0 > -64) {
            method2183((byte) -122);
        }
        class5.method28(26286);
        class172.method1164(88);
        class26.method202(12608);
        class182.method1242(0);
        if (class284.field4882 != null && class73.field1289 != null && class280.field4818 == 25) {
            class159.field2710.method885(25, -81);
            class122.field2169++;
            class159.field2710.method1577(true, 1057001181);
        }
        if (!class11.field142) {
            int var29 = (class264.field4598 + 6) / 8;
            int var30 = (class264.field4598 - 6) / 8;
            int var31 = (class165.field2797 + 6) / 8;
            int var32 = (class165.field2797 - 6) / 8;
            for (int var33 = var30 - 1; var33 <= (var29 + 1); var33++) {
                for (int var34 = var32 - 1; var34 <= var31 + 1; var34++) {
                    if (var30 > var33 || var33 > var29 || var32 > var34 || var34 > var31) {
                        class114.field2011.method1432(true, class100.method755(-6, new class258[] { class93.field1642, class218.method1481(61, var33), class255.field4374, class218.method1481(121, var34) }));
                        class114.field2011.method1432(true, class100.method755(-6, new class258[] { class220.field3806, class218.method1481(-102, var33), class255.field4374, class218.method1481(74, var34) }));
                    }
                }
            }
        }
        if (class280.field4818 == 28) {
            class106.method791((byte) 8, 10);
        } else {
            class106.method791((byte) 8, 30);
            if (class73.field1289 != null) {
                class159.field2710.method885(70, -68);
            }
        }
        class172.method1164(113);
        class310.method2155((byte) -126);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I[F)[F", line = 544)
    public static final float[] method2178(int arg0, float[] arg1) {
        int var2 = -127 % ((-arg0 - 40) / 52);
        field5342++;
        if (arg1 == null) {
            return null;
        } else {
            float[] var3 = new float[arg1.length];
            class275.method1928(arg1, 0, var3, 0, arg1.length);
            return var3;
        }
    }

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "(B)V", line = 570)
    public final void method2179(byte arg0) {
        if (arg0 <= 107) {
            return;
        }
        field5339++;
        int var2 = class79.method570(0);
        if ((var2 & 0x1) == 0) {
            class257.method1736(this.field5335);
        }
        if ((var2 & 0x2) == 0) {
            class257.method1758(0);
        }
        if ((var2 & 0x4) == 0) {
            class257.method1750(0);
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)I", line = 609)
    public static final int method2180(int arg0) {
        field5336++;
        int var1 = 104 % ((73 - arg0) / 46);
        if ((double) class313.field5302 == 3.0D) {
            return 37;
        } else if ((double) class313.field5302 == 4.0D) {
            return 50;
        } else if ((double) class313.field5302 == 6.0D) {
            return 75;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIILrk;IJZ)Z", line = 628)
    public static final boolean method2181(int arg0, int arg1, int arg2, int arg3, int arg4, class123 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return client.method349(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BI)V", line = 678)
    public static final void method2182(byte arg0, int arg1) {
        class301.field5148.method1156(arg1, 0);
        if (arg0 > -104) {
            field5337 = (class258) null;
        }
        field5346++;
    }

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "(B)V", line = 689)
    public static void method2183(byte arg0) {
        field5344 = null;
        field5343 = null;
        field5337 = null;
        field5349 = null;
        int var1 = -49 % ((-arg0 - 51) / 51);
        field5340 = null;
        field5351 = null;
        field5350 = null;
    }
}
