import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class393 {

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "Z")
    public boolean field5651 = false;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public int field5648 = -1;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    private int field5652 = 0;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    private int field5661 = 0;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    private int field5653 = 128;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
    private int field5669 = 0;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    private int field5664 = 128;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "Z")
    public boolean field5666 = false;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field5657 = 0;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    private int field5665;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
    public int field5670;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "Lam;")
    public static class286 field5649;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "[S")
    private short[] field5650;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "[S")
    private short[] field5658;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "[S")
    private short[] field5663;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "[S")
    private short[] field5667;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZLii;)V", line = 5)
    public static final void method2443(boolean arg0, class405 arg1) {
        field5659++;
        if (arg1 == null || class342.field4577.field1942 == arg1) {
            return;
        }
        int var2 = arg1.field5897;
        int var3 = arg1.field5894;
        int var4 = arg1.field5892;
        int var5 = (int) arg1.field5891;
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        long var6 = arg1.field5891;
        if (var4 == 22) {
            class158 var8 = class85.field957[var5];
            if (var8 != null) {
                class131.field1695 = class341.field4568;
                class397.field5712++;
                class71.field789 = class96.field1147;
                class176.field2201 = 2;
                class417.field5996 = 0;
                class281.field3857.method295(20579, 251);
                class281.field3857.method1376(-8, var5);
                class281.field3857.method1378(class199.field2657, (byte) 47);
                class281.field3857.method1360(class106.field1297, -118);
                class281.field3857.method1354(class249.field3361[82] ? 1 : 0, -64);
                class108.method573(0, 0, class427.field6264.field6109[0], class427.field6264.field6119[0], var8.method857((byte) -106), var8.field6109[0], var8.method857((byte) -106), -2, true, var8.field6119[0], true);
            }
        }
        if (var4 == 20) {
            class91 var9 = class38.field397[var5];
            if (var9 != null) {
                class71.field789 = class96.field1147;
                class417.field5996 = 0;
                class131.field1695 = class341.field4568;
                field5662++;
                class176.field2201 = 2;
                class281.field3857.method295(20579, 48);
                class281.field3857.method1345(107, class199.field2657);
                class281.field3857.method1332(-128, class106.field1297);
                class281.field3857.method1354(class249.field3361[82] ? 1 : 0, -95);
                class281.field3857.method1360(var5, -119);
                class108.method573(0, 0, class427.field6264.field6109[0], class427.field6264.field6119[0], var9.method857((byte) -106), var9.field6109[0], var9.method857((byte) -106), -2, arg0, var9.field6119[0], true);
            }
        }
        if (var4 == 28) {
            class417.field5996 = 0;
            class256.field3499++;
            class131.field1695 = class341.field4568;
            class176.field2201 = 2;
            class71.field789 = class96.field1147;
            class281.field3857.method295(20579, 157);
            class281.field3857.method1346(125, class291.field3961 + var3);
            class281.field3857.method1376(115, var2 + class70.field767);
            class281.field3857.method1376(114, var5);
            class281.field3857.method1341(class249.field3361[82] ? 1 : 0, -109);
            class210.method1139(var2, var3, (byte) -92);
        }
        if (var4 == 42) {
            class194 var10 = class57.method301(var3, (byte) 78);
            boolean var11 = true;
            if (var10.field2455 > 0) {
                var11 = class330.method1893(var10, (byte) 53);
            }
            if (var11) {
                class281.field3857.method295(20579, 68);
                class448.field6511++;
                class281.field3857.method1357(var3, 1826838072);
            }
        }
        if (var4 == 46) {
            class158 var12 = class85.field957[var5];
            if (var12 != null) {
                class421.field6183++;
                class71.field789 = class96.field1147;
                class176.field2201 = 2;
                class131.field1695 = class341.field4568;
                class417.field5996 = 0;
                class281.field3857.method295(20579, 246);
                class281.field3857.method1346(124, var5);
                class281.field3857.method1388(31475, class249.field3361[82] ? 1 : 0);
                class108.method573(0, 0, class427.field6264.field6109[0], class427.field6264.field6119[0], var12.method857((byte) -106), var12.field6109[0], var12.method857((byte) -106), -2, true, var12.field6119[0], true);
            }
        }
        if (var4 == 6) {
            class71.field789 = class96.field1147;
            class417.field5996 = 0;
            class176.field2201 = 2;
            class423.field6217++;
            class131.field1695 = class341.field4568;
            class281.field3857.method295(20579, 199);
            class281.field3857.method1376(-123, var5);
            class281.field3857.method1332(-128, class291.field3961 + var3);
            class281.field3857.method1346(121, class70.field767 + var2);
            class281.field3857.method1354(class249.field3361[82] ? 1 : 0, -101);
            class210.method1139(var2, var3, (byte) -125);
        }
        if (var4 == 10) {
            class281.field3857.method295(20579, 68);
            class448.field6511++;
            class281.field3857.method1357(var3, 1826838072);
            class194 var13 = class57.method301(var3, (byte) 111);
            if (var13.field2579 != null && var13.field2579[0][0] == 5) {
                int var14 = var13.field2579[0][1];
                if (class254.field3495[var14] != var13.field2610[0]) {
                    class254.field3495[var14] = var13.field2610[0];
                    class187.method1008(false, var14);
                }
            }
        }
        if (var4 == 1009 || var4 == 1012 || var4 == 1004 || var4 == 1008 || var4 == 1005) {
            class126.method681(var5, var4, var2, true);
        }
        if (var4 == 13) {
            class281.field3857.method295(20579, 138);
            class92.field1051++;
            class281.field3857.method1357(var3, 1826838072);
            class281.field3857.method1360(var5, -128);
            class281.field3857.method1332(-128, var2);
            class419.field6090 = 0;
            class283.field3873 = class57.method301(var3, (byte) 69);
            class236.field3260 = var2;
        }
        if (var4 == 30) {
            class91 var15 = class38.field397[var5];
            if (var15 != null) {
                class71.field789 = class96.field1147;
                class176.field2201 = 2;
                class131.field1695 = class341.field4568;
                class305.field4132++;
                class417.field5996 = 0;
                class281.field3857.method295(20579, 200);
                class281.field3857.method1360(var5, -125);
                class281.field3857.method1386(-222840624, class249.field3361[82] ? 1 : 0);
                class108.method573(0, 0, class427.field6264.field6109[0], class427.field6264.field6119[0], var15.method857((byte) -106), var15.field6109[0], var15.method857((byte) -106), -2, true, var15.field6119[0], true);
            }
        }
        if (var4 == 24) {
            class248.method1320((byte) -103, false);
        }
        if (var4 == 17) {
            class131.field1695 = class341.field4568;
            class327.field4348++;
            class176.field2201 = 1;
            class71.field789 = class96.field1147;
            class417.field5996 = 0;
            class281.field3857.method295(20579, 2);
            class281.field3857.method1346(124, class70.field767 + var2);
            class281.field3857.method1357(class199.field2657, 1826838072);
            class281.field3857.method1332(-128, class106.field1297);
            class281.field3857.method1346(121, class291.field3961 + var3);
            class108.method573(0, 0, class427.field6264.field6109[0], class427.field6264.field6119[0], 1, var3, 1, -4, true, var2, true);
        }
        if (var4 == 4) {
            class194 var16 = class142.method769(-1, var2, var3);
            if (var16 != null) {
                class425.method2641(true);
                class219 var17 = client.method1410(var16);
                class278.method1536(var16.field2475, var16.field2544, var2, var17.field2929, var17.method1180((byte) 88), var3, -1);
                class171.field2155 = 0;
                class132.field1699 = class430.method2659(var16, 9);
                if (class132.field1699 == null) {
                    class132.field1699 = "Null";
                }
                if (var16.field2575) {
                    class77.field874 = var16.field2535 + "<col=ffffff>";
                    return;
                }
                class77.field874 = "<col=00ff00>" + var16.field2519 + "<col=ffffff>";
            }
            return;
        }
        if (var4 == 21) {
            class158 var18 = class85.field957[var5];
            if (var18 != null) {
                class417.field5996 = 0;
                class71.field789 = class96.field1147;
                class70.field751++;
                class176.field2201 = 2;
                class131.field1695 = class341.field4568;
                class281.field3857.method295(20579, 212);
                class281.field3857.method1341(class249.field3361[82] ? 1 : 0, -108);
                class281.field3857.method1376(-121, var5);
                class108.method573(0, 0, class427.field6264.field6109[0], class427.field6264.field6119[0], var18.method857((byte) -106), var18.field6109[0], var18.method857((byte) -106), -2, true, var18.field6119[0], true);
            }
        }
        if (var4 == 14) {
            class158 var19 = class85.field957[var5];
            if (var19 != null) {
                class176.field2201 = 2;
                class12.field112++;
                class417.field5996 = 0;
                class131.field1695 = class341.field4568;
                class71.field789 = class96.field1147;
                class281.field3857.method295(20579, 205);
                class281.field3857.method1332(-128, var5);
                class281.field3857.method1388(31475, class249.field3361[82] ? 1 : 0);
                class108.method573(0, 0, class427.field6264.field6109[0], class427.field6264.field6119[0], var19.method857((byte) -106), var19.field6109[0], var19.method857((byte) -106), -2, true, var19.field6119[0], true);
            }
        }
        if (var4 == 9) {
            class195.field2634++;
            class417.field5996 = 0;
            class176.field2201 = 2;
            class71.field789 = class96.field1147;
            class131.field1695 = class341.field4568;
            class281.field3857.method295(20579, 226);
            class281.field3857.method1388(31475, class249.field3361[82] ? 1 : 0);
            class281.field3857.method1376(36, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class281.field3857.method1346(126, var3 + class291.field3961);
            class281.field3857.method1360(class70.field767 + var2, -127);
            class435.method2687(var3, var6, 27, var2);
        }
        if (var4 == 47) {
            class158 var20 = class85.field957[var5];
            if (var20 != null) {
                class101.field1198++;
                class71.field789 = class96.field1147;
                class131.field1695 = class341.field4568;
                class417.field5996 = 0;
                class176.field2201 = 2;
                class281.field3857.method295(20579, 122);
                class281.field3857.method1332(-128, var5);
                class281.field3857.method1388(31475, class249.field3361[82] ? 1 : 0);
                class108.method573(0, 0, class427.field6264.field6109[0], class427.field6264.field6119[0], var20.method857((byte) -106), var20.field6109[0], var20.method857((byte) -106), -2, true, var20.field6119[0], true);
            }
        }
        if (var4 == 1) {
            class333.field4424++;
            class281.field3857.method295(20579, 62);
            class281.field3857.method1357(var3, 1826838072);
            class281.field3857.method1376(17, var5);
            class281.field3857.method1346(119, var2);
            class419.field6090 = 0;
            class283.field3873 = class57.method301(var3, (byte) 126);
            class236.field3260 = var2;
        }
        if (var4 == 35) {
            class281.field3857.method295(20579, 13);
            class143.field1823++;
            class281.field3857.method1357(var3, 1826838072);
            class281.field3857.method1360(var5, -117);
            class281.field3857.method1332(-128, var2);
            class419.field6090 = 0;
            class283.field3873 = class57.method301(var3, (byte) 109);
            class236.field3260 = var2;
        }
        if (var4 == 29) {
            class131.field1695 = class341.field4568;
            class417.field5996 = 0;
            class71.field789 = class96.field1147;
            class194.field2474++;
            class176.field2201 = 2;
            class281.field3857.method295(20579, 216);
            class281.field3857.method1354(class249.field3361[82] ? 1 : 0, -104);
            class281.field3857.method1376(85, var3 + class291.field3961);
            class281.field3857.method1360(class207.field2794, -115);
            class281.field3857.method1376(-113, class70.field767 + var2);
            class281.field3857.method1360(var5, -120);
            class281.field3857.method1360(class6.field57, -128);
            class281.field3857.method1378(class108.field1325, (byte) 47);
            class210.method1139(var2, var3, (byte) -97);
        }
        if (var4 == 7) {
            class389.field5557++;
            class417.field5996 = 0;
            class176.field2201 = 2;
            class131.field1695 = class341.field4568;
            class71.field789 = class96.field1147;
            class281.field3857.method295(20579, 236);
            class281.field3857.method1371(class199.field2657, (byte) 126);
            class281.field3857.method1376(-117, var2 + class70.field767);
            class281.field3857.method1360(class106.field1297, -128);
            class281.field3857.method1346(126, class291.field3961 + var3);
            class281.field3857.method1341(class249.field3361[82] ? 1 : 0, -100);
            class281.field3857.method1332(-128, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class435.method2687(var3, var6, 71, var2);
        }
        if (var4 == 57) {
            class176.field2201 = 2;
            class71.field789 = class96.field1147;
            class417.field5996 = 0;
            class131.field1695 = class341.field4568;
            class420.field6129++;
            class281.field3857.method295(20579, 170);
            class281.field3857.method1376(23, var2 + class70.field767);
            class281.field3857.method1346(127, var5);
            class281.field3857.method1354(class249.field3361[82] ? 1 : 0, -85);
            class281.field3857.method1360(class291.field3961 + var3, -115);
            class210.method1139(var2, var3, (byte) -90);
        }
        if (var4 == 40) {
            class91 var21 = class38.field397[var5];
            if (var21 != null) {
                class71.field789 = class96.field1147;
                class176.field2201 = 2;
                class417.field5996 = 0;
                class131.field1695 = class341.field4568;
                class171.field2149++;
                class281.field3857.method295(20579, 33);
                class281.field3857.method1386(-222840624, class249.field3361[82] ? 1 : 0);
                class281.field3857.method1376(-119, var5);
                class108.method573(0, 0, class427.field6264.field6109[0], class427.field6264.field6119[0], var21.method857((byte) -106), var21.field6109[0], var21.method857((byte) -106), -2, true, var21.field6119[0], true);
            }
        }
        if (!arg0) {
            field5657 = -52;
        }
        if (var4 == 51) {
            class281.field3857.method295(20579, 134);
            class402.field5859++;
            class281.field3857.method1357(var3, 1826838072);
            class281.field3857.method1332(-128, var2);
            class281.field3857.method1376(15, class207.field2794);
            class281.field3857.method1378(class108.field1325, (byte) 47);
            class281.field3857.method1360(class6.field57, -110);
            class281.field3857.method1376(-25, var5);
            class419.field6090 = 0;
            class283.field3873 = class57.method301(var3, (byte) 96);
            class236.field3260 = var2;
        }
        if (var4 == 12) {
            class91 var22 = class38.field397[var5];
            if (var22 != null) {
                class131.field1695 = class341.field4568;
                class176.field2201 = 2;
                class417.field5996 = 0;
                class71.field789 = class96.field1147;
                class312.field4203++;
                class281.field3857.method295(20579, 139);
                class281.field3857.method1386(-222840624, class249.field3361[82] ? 1 : 0);
                class281.field3857.method1360(var5, -117);
                class108.method573(0, 0, class427.field6264.field6109[0], class427.field6264.field6119[0], var22.method857((byte) -106), var22.field6109[0], var22.method857((byte) -106), -2, true, var22.field6119[0], true);
            }
        }
        if (var4 == 25) {
            class158 var23 = class85.field957[var5];
            if (var23 != null) {
                class71.field789 = class96.field1147;
                class131.field1695 = class341.field4568;
                class56.field563++;
                class176.field2201 = 2;
                class417.field5996 = 0;
                class281.field3857.method295(20579, 154);
                class281.field3857.method1341(class249.field3361[82] ? 1 : 0, -115);
                class281.field3857.method1376(-118, var5);
                class108.method573(0, 0, class427.field6264.field6109[0], class427.field6264.field6119[0], var23.method857((byte) -106), var23.field6109[0], var23.method857((byte) -106), -2, true, var23.field6119[0], true);
            }
        }
        if (var4 == 59) {
            class281.field3857.method295(20579, 82);
            class392.field5640++;
            class281.field3857.method1357(var3, 1826838072);
            class281.field3857.method1371(class199.field2657, (byte) 60);
            class281.field3857.method1332(-128, class106.field1297);
            class281.field3857.method1376(-16, var5);
            class281.field3857.method1360(var2, -115);
            class419.field6090 = 0;
            class283.field3873 = class57.method301(var3, (byte) 124);
            class236.field3260 = var2;
        }
        if (var4 == 19) {
            class158 var24 = class85.field957[var5];
            if (var24 != null) {
                class71.field789 = class96.field1147;
                class131.field1695 = class341.field4568;
                class176.field2201 = 2;
                class259.field3524++;
                class417.field5996 = 0;
                class281.field3857.method295(20579, 245);
                class281.field3857.method1341(class249.field3361[82] ? 1 : 0, -115);
                class281.field3857.method1360(var5, -121);
                class108.method573(0, 0, class427.field6264.field6109[0], class427.field6264.field6119[0], var24.method857((byte) -106), var24.field6109[0], var24.method857((byte) -106), -2, arg0, var24.field6119[0], true);
            }
        }
        if (var4 == 18) {
            class281.field3857.method295(20579, 183);
            class101.field1190++;
            class281.field3857.method1357(var3, 1826838072);
            class281.field3857.method1332(-128, class106.field1297);
            class281.field3857.method1378(class199.field2657, (byte) 47);
            class281.field3857.method1376(-128, var2);
        }
        if (var4 == 38) {
            class111.field1382++;
            class176.field2201 = 2;
            class71.field789 = class96.field1147;
            class131.field1695 = class341.field4568;
            class417.field5996 = 0;
            class281.field3857.method295(20579, 219);
            class281.field3857.method1360(class291.field3961 + var3, -125);
            class281.field3857.method1376(-117, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class281.field3857.method1388(31475, class249.field3361[82] ? 1 : 0);
            class281.field3857.method1332(-128, class70.field767 + var2);
            class435.method2687(var3, var6, 100, var2);
        }
        if (var4 == 3) {
            class158 var25 = class85.field957[var5];
            if (var25 != null) {
                class71.field789 = class96.field1147;
                class131.field1695 = class341.field4568;
                class320.field4276++;
                class176.field2201 = 2;
                class417.field5996 = 0;
                class281.field3857.method295(20579, 180);
                class281.field3857.method1386(-222840624, class249.field3361[82] ? 1 : 0);
                class281.field3857.method1360(var5, -123);
                class108.method573(0, 0, class427.field6264.field6109[0], class427.field6264.field6119[0], var25.method857((byte) -106), var25.field6109[0], var25.method857((byte) -106), -2, arg0, var25.field6119[0], true);
            }
        }
        if (var4 == 1003) {
            class417.field5996 = 0;
            class131.field1695 = class341.field4568;
            class176.field2201 = 2;
            class225.field3033++;
            class71.field789 = class96.field1147;
            class281.field3857.method295(20579, 206);
            class281.field3857.method1376(111, var5);
        }
        if (var4 == 31) {
            class68.field713++;
            class281.field3857.method295(20579, 58);
            class281.field3857.method1357(var3, 1826838072);
            class281.field3857.method1360(var2, -120);
            class281.field3857.method1360(var5, -123);
            class419.field6090 = 0;
            class283.field3873 = class57.method301(var3, (byte) 75);
            class236.field3260 = var2;
        }
        if (var4 == 50) {
            class91 var26 = class38.field397[var5];
            if (var26 != null) {
                class71.field789 = class96.field1147;
                class320.field4279++;
                class131.field1695 = class341.field4568;
                class176.field2201 = 2;
                class417.field5996 = 0;
                class281.field3857.method295(20579, 28);
                class281.field3857.method1341(class249.field3361[82] ? 1 : 0, -117);
                class281.field3857.method1346(117, var5);
                class108.method573(0, 0, class427.field6264.field6109[0], class427.field6264.field6119[0], var26.method857((byte) -106), var26.field6109[0], var26.method857((byte) -106), -2, true, var26.field6119[0], true);
            }
        }
        if (var4 == 43) {
            class36.field363++;
            class281.field3857.method295(20579, 232);
            class281.field3857.method1357(var3, 1826838072);
            class281.field3857.method1346(124, var5);
            class281.field3857.method1346(123, var2);
            class419.field6090 = 0;
            class283.field3873 = class57.method301(var3, (byte) 107);
            class236.field3260 = var2;
        }
        if (var4 == 1001) {
            class194 var27 = class57.method301(var3, (byte) 69);
            if (var27 == null || var27.field2489[var2] < 100000) {
                class281.field3857.method295(20579, 206);
                class225.field3033++;
                class281.field3857.method1376(-120, var5);
            } else {
                class371.method2240(var27.field2489[var2] + " x " + class65.method368(var5, -119).field1519, -67);
            }
            class419.field6090 = 0;
            class283.field3873 = class57.method301(var3, (byte) 93);
            class236.field3260 = var2;
        }
        if (var4 == 34) {
            class131.field1695 = class341.field4568;
            class176.field2201 = 2;
            class44.field450++;
            class71.field789 = class96.field1147;
            class417.field5996 = 0;
            class281.field3857.method295(20579, 104);
            class281.field3857.method1360(var5, -114);
            class281.field3857.method1360(class291.field3961 + var3, -128);
            class281.field3857.method1388(31475, class249.field3361[82] ? 1 : 0);
            class281.field3857.method1332(-128, class70.field767 + var2);
            class210.method1139(var2, var3, (byte) -97);
        }
        if (var4 == 60) {
            class46.field459++;
            class176.field2201 = 2;
            class417.field5996 = 0;
            class131.field1695 = class341.field4568;
            class71.field789 = class96.field1147;
            class281.field3857.method295(20579, 211);
            class281.field3857.method1332(-128, var5);
            class281.field3857.method1386(-222840624, class249.field3361[82] ? 1 : 0);
            class281.field3857.method1346(123, class106.field1297);
            class281.field3857.method1371(class199.field2657, (byte) 110);
            class281.field3857.method1332(-128, class291.field3961 + var3);
            class281.field3857.method1360(class70.field767 + var2, -117);
            class210.method1139(var2, var3, (byte) -89);
        }
        if (var4 == 44 && class203.field2717 == null) {
            class307.method1804(var2, (byte) -108, var3);
            class203.field2717 = class142.method769(-1, var2, var3);
            class204.method1107(class203.field2717, (byte) -116);
        }
        if (var4 == 39) {
            class417.field5996 = 0;
            class339.field4517++;
            class71.field789 = class96.field1147;
            class131.field1695 = class341.field4568;
            class176.field2201 = 2;
            class281.field3857.method295(20579, 238);
            class281.field3857.method1376(80, class70.field767 + var2);
            class281.field3857.method1341(class249.field3361[82] ? 1 : 0, -123);
            class281.field3857.method1332(-128, class291.field3961 + var3);
            class281.field3857.method1332(-128, var5);
            class210.method1139(var2, var3, (byte) -90);
        }
        if (var4 == 37) {
            class91 var28 = class38.field397[var5];
            if (var28 != null) {
                class176.field2201 = 2;
                class71.field789 = class96.field1147;
                class417.field5996 = 0;
                class169.field2140++;
                class131.field1695 = class341.field4568;
                class281.field3857.method295(20579, 88);
                class281.field3857.method1386(-222840624, class249.field3361[82] ? 1 : 0);
                class281.field3857.method1332(-128, var5);
                class108.method573(0, 0, class427.field6264.field6109[0], class427.field6264.field6119[0], var28.method857((byte) -106), var28.field6109[0], var28.method857((byte) -106), -2, true, var28.field6119[0], true);
            }
        }
        if (var4 == 33) {
            if (class110.field1357 > 0 && class249.field3361[82] && class249.field3361[81]) {
                class198.method1061(class70.field767 + var2, class263.field3592, (byte) 39, class291.field3961 + var3);
            } else {
                class192.method1032(var2, 256, var5, var3);
                if (var5 == 1) {
                    class281.field3857.method1386(-222840624, -1);
                    class281.field3857.method1386(-222840624, -1);
                    class281.field3857.method1346(118, (int) class425.field6241);
                    class281.field3857.method1386(-222840624, 57);
                    class281.field3857.method1386(-222840624, class136.field1731);
                    class281.field3857.method1386(-222840624, class411.field5937);
                    class281.field3857.method1386(-222840624, 89);
                    class281.field3857.method1346(120, class427.field6264.field152);
                    class281.field3857.method1346(125, class427.field6264.field154);
                    class281.field3857.method1386(-222840624, 63);
                } else {
                    class71.field789 = class96.field1147;
                    class176.field2201 = 1;
                    class417.field5996 = 0;
                    class131.field1695 = class341.field4568;
                }
                class108.method573(0, 0, class427.field6264.field6109[0], class427.field6264.field6119[0], 1, var3, 1, -4, true, var2, true);
            }
        }
        if (var4 == 48) {
            class91 var29 = class38.field397[var5];
            if (var29 != null) {
                class131.field1695 = class341.field4568;
                class405.field5887++;
                class71.field789 = class96.field1147;
                class176.field2201 = 2;
                class417.field5996 = 0;
                class281.field3857.method295(20579, 108);
                class281.field3857.method1371(class108.field1325, (byte) 84);
                class281.field3857.method1376(-116, var5);
                class281.field3857.method1360(class207.field2794, -115);
                class281.field3857.method1341(class249.field3361[82] ? 1 : 0, -105);
                class281.field3857.method1360(class6.field57, -124);
                class108.method573(0, 0, class427.field6264.field6109[0], class427.field6264.field6119[0], var29.method857((byte) -106), var29.field6109[0], var29.method857((byte) -106), -2, arg0, var29.field6119[0], true);
            }
        }
        if (var4 == 58) {
            class417.field5996 = 0;
            class71.field789 = class96.field1147;
            class351.field4892++;
            class131.field1695 = class341.field4568;
            class176.field2201 = 2;
            class281.field3857.method295(20579, 233);
            class281.field3857.method1376(-20, class70.field767 + var2);
            class281.field3857.method1376(-113, class291.field3961 + var3);
            class281.field3857.method1386(-222840624, class249.field3361[82] ? 1 : 0);
            class281.field3857.method1346(126, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class435.method2687(var3, var6, -60, var2);
        }
        if (var4 == 45 || var4 == 1006) {
            class128.method690(var5, var3, 5, var2, arg1.field5899);
        }
        if (var4 == 16) {
            class425.method2641(true);
            class194 var30 = class57.method301(var3, (byte) 81);
            class171.field2155 = 1;
            class6.field57 = var2;
            class207.field2794 = var5;
            class108.field1325 = var3;
            class204.method1107(var30, (byte) -96);
            class114.field1425 = "<col=ff9040>" + class65.method368(var5, -115).field1519 + "<col=ffffff>";
            if (class114.field1425 == null) {
                class114.field1425 = "null";
            }
            return;
        }
        if (var4 == 26) {
            class281.field3857.method295(20579, 204);
            class151.field1915++;
            class281.field3857.method1357(var3, 1826838072);
            class281.field3857.method1332(-128, var5);
            class281.field3857.method1360(var2, -113);
            class419.field6090 = 0;
            class283.field3873 = class57.method301(var3, (byte) 84);
            class236.field3260 = var2;
        }
        if (var4 == 2) {
            class71.field789 = class96.field1147;
            class417.field5991++;
            class417.field5996 = 0;
            class131.field1695 = class341.field4568;
            class176.field2201 = 2;
            class281.field3857.method295(20579, 89);
            class281.field3857.method1354(class249.field3361[82] ? 1 : 0, -73);
            class281.field3857.method1376(-113, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class281.field3857.method1332(-128, var2 + class70.field767);
            class281.field3857.method1360(var3 + class291.field3961, -122);
            class435.method2687(var3, var6, 113, var2);
        }
        if (var4 == 15) {
            class281.field3857.method295(20579, 249);
            class176.field2207++;
            class281.field3857.method1357(var3, 1826838072);
            class281.field3857.method1360(var2, -127);
            class281.field3857.method1332(-128, var5);
            class419.field6090 = 0;
            class283.field3873 = class57.method301(var3, (byte) 76);
            class236.field3260 = var2;
        }
        if (var4 == 41) {
            class281.field3857.method295(20579, 67);
            class29.field283++;
            class281.field3857.method1357(var3, 1826838072);
            class281.field3857.method1332(-128, var2);
            class281.field3857.method1332(-128, var5);
            class419.field6090 = 0;
            class283.field3873 = class57.method301(var3, (byte) 83);
            class236.field3260 = var2;
        }
        if (var4 == 5) {
            class281.field3857.method295(20579, 4);
            class1.field3++;
            class281.field3857.method1357(var3, 1826838072);
            class281.field3857.method1332(-128, var2);
            class281.field3857.method1376(82, var5);
            class419.field6090 = 0;
            class283.field3873 = class57.method301(var3, (byte) 65);
            class236.field3260 = var2;
        }
        if (var4 == 11) {
            class158 var31 = class85.field957[var5];
            if (var31 != null) {
                class105.field1295++;
                class131.field1695 = class341.field4568;
                class71.field789 = class96.field1147;
                class417.field5996 = 0;
                class176.field2201 = 2;
                class281.field3857.method295(20579, 231);
                class281.field3857.method1386(-222840624, class249.field3361[82] ? 1 : 0);
                class281.field3857.method1332(-128, var5);
                class108.method573(0, 0, class427.field6264.field6109[0], class427.field6264.field6119[0], var31.method857((byte) -106), var31.field6109[0], var31.method857((byte) -106), -2, true, var31.field6119[0], true);
            }
        }
        if (var4 == 1011) {
            class176.field2201 = 2;
            class131.field1695 = class341.field4568;
            class417.field5996 = 0;
            class71.field789 = class96.field1147;
            class91 var32 = class38.field397[var5];
            if (var32 != null) {
                class345 var33 = var32.field1035;
                if (var33.field4672 != null) {
                    var33 = var33.method2026(-1);
                }
                if (var33 != null) {
                    class281.field3857.method295(20579, 87);
                    class379.field5354++;
                    class281.field3857.method1332(-128, var33.field4648);
                }
            }
        }
        if (var4 == 23) {
            if (class110.field1357 > 0 && class249.field3361[82] && class249.field3361[81]) {
                class198.method1061(class70.field767 + var2, class263.field3592, (byte) 39, class291.field3961 + var3);
            } else {
                class176.field2201 = 1;
                class131.field1695 = class341.field4568;
                class73.field810++;
                class417.field5996 = 0;
                class71.field789 = class96.field1147;
                class281.field3857.method295(20579, 164);
                class281.field3857.method1332(-128, class70.field767 + var2);
                class281.field3857.method1360(class291.field3961 + var3, -114);
            }
        }
        if (var4 == 32) {
            class281.field3857.method295(20579, 253);
            class365.field5116++;
            class281.field3857.method1357(var3, 1826838072);
            class281.field3857.method1360(var2, -117);
            class281.field3857.method1360(var5, -120);
            class419.field6090 = 0;
            class283.field3873 = class57.method301(var3, (byte) 106);
            class236.field3260 = var2;
        }
        if (var4 == 36) {
            class448.field6511++;
            class281.field3857.method295(20579, 68);
            class281.field3857.method1357(var3, 1826838072);
            class194 var34 = class57.method301(var3, (byte) 124);
            if (var34.field2579 != null && var34.field2579[0][0] == 5) {
                int var35 = var34.field2579[0][1];
                class254.field3495[var35] = 1 - class254.field3495[var35];
                class187.method1008(false, var35);
            }
        }
        if (var4 == 1010) {
            class131.field1695 = class341.field4568;
            class125.field1616++;
            class71.field789 = class96.field1147;
            class417.field5996 = 0;
            class176.field2201 = 2;
            class281.field3857.method295(20579, 218);
            class281.field3857.method1332(-128, var5);
        }
        if (var4 == 1002) {
            class176.field2201 = 2;
            class71.field789 = class96.field1147;
            class131.field1695 = class341.field4568;
            class70.field755++;
            class417.field5996 = 0;
            class281.field3857.method295(20579, 94);
            class281.field3857.method1360((int) (var6 >>> 32) & Integer.MAX_VALUE, -117);
            class281.field3857.method1376(44, class70.field767 + var2);
            class281.field3857.method1341(class249.field3361[82] ? 1 : 0, -126);
            class281.field3857.method1346(127, class291.field3961 + var3);
            class435.method2687(var3, var6, 113, var2);
        }
        if (var4 == 8) {
            class71.field789 = class96.field1147;
            class417.field5996 = 0;
            class176.field2201 = 2;
            class80.field892++;
            class131.field1695 = class341.field4568;
            class281.field3857.method295(20579, 141);
            class281.field3857.method1357(class108.field1325, 1826838072);
            class281.field3857.method1388(31475, class249.field3361[82] ? 1 : 0);
            class281.field3857.method1332(-128, class6.field57);
            class281.field3857.method1360(Integer.MAX_VALUE & (int) (var6 >>> 32), -113);
            class281.field3857.method1346(124, class207.field2794);
            class281.field3857.method1376(34, class70.field767 + var2);
            class281.field3857.method1376(-121, class291.field3961 + var3);
            class435.method2687(var3, var6, -72, var2);
        }
        if (var4 == 49) {
            class158 var36 = class85.field957[var5];
            if (var36 != null) {
                class131.field1695 = class341.field4568;
                class176.field2201 = 2;
                class410.field5933++;
                class417.field5996 = 0;
                class71.field789 = class96.field1147;
                class281.field3857.method295(20579, 73);
                class281.field3857.method1360(class6.field57, -113);
                class281.field3857.method1345(115, class108.field1325);
                class281.field3857.method1360(class207.field2794, -111);
                class281.field3857.method1332(-128, var5);
                class281.field3857.method1388(31475, class249.field3361[82] ? 1 : 0);
                class108.method573(0, 0, class427.field6264.field6109[0], class427.field6264.field6119[0], var36.method857((byte) -106), var36.field6109[0], var36.method857((byte) -106), -2, true, var36.field6119[0], true);
            }
        }
        if (class171.field2155 != 0) {
            class171.field2155 = 0;
            class204.method1107(class57.method301(class108.field1325, (byte) 88), (byte) -125);
        }
        if (class65.field682) {
            class425.method2641(arg0);
        }
        if (class283.field3873 != null && class419.field6090 == 0) {
            class204.method1107(class283.field3873, (byte) -107);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZIBLjava/lang/String;)Z", line = 1059)
    public static final boolean method2444(boolean arg0, int arg1, byte arg2, String arg3) {
        field5668++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        if (arg2 > -119) {
            field5649 = null;
        }
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg3.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg1) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if (var10 / arg1 != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZZLjava/lang/Object;)[B", line = 1136)
    public static final byte[] method2445(boolean arg0, boolean arg1, Object arg2) {
        field5656++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class440.method2725(true, var3) : var3;
        } else if (arg2 instanceof class297) {
            class297 var4 = (class297) arg2;
            return var4.method181(-58);
        } else {
            if (arg1) {
                field5649 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILvm;BII)Ljn;", line = 1180)
    public final class396 method2446(int arg0, int arg1, class322 arg2, byte arg3, int arg4, int arg5) {
        field5654++;
        int var7 = arg5;
        class208 var8 = this.field5648 == -1 || arg1 == -1 ? null : class193.method1037(arg3 ^ 0x51, this.field5648);
        if (var8 != null) {
            var7 = arg5 | var8.method1126(arg1, arg4, false, (byte) -36);
        }
        if (this.field5653 != 128) {
            var7 |= 0x2;
        }
        if (this.field5664 != 128 || this.field5669 != 0) {
            var7 |= 0x5;
        }
        class114 var9 = class203.field2718;
        class396 var10;
        synchronized (class203.field2718) {
            var10 = (class396) class203.field2718.method616(-2, (long) (this.field5670 |= arg2.field4307 << 29));
        }
        if (var10 == null || arg2.method1620(var10.method2312(), var7) != 0) {
            if (var10 != null) {
                var7 = arg2.method1634(var7, var10.method2312());
            }
            int var11 = var7;
            if (this.field5650 != null) {
                var11 = var7 | 0x2000;
            }
            if (this.field5658 != null) {
                var11 |= 0x4000;
            }
            class390 var12 = class208.method1122(class430.field6317, 0, -120, this.field5665);
            if (var12 == null) {
                return null;
            }
            var10 = arg2.method1651(var12, var11, class87.field988, this.field5661 + 64, this.field5652 + 850);
            if (this.field5650 != null) {
                for (int var13 = 0; var13 < this.field5650.length; var13++) {
                    var10.method2307(this.field5650[var13], this.field5667[var13]);
                }
            }
            if (this.field5658 != null) {
                for (int var14 = 0; var14 < this.field5658.length; var14++) {
                    var10.method2310(this.field5658[var14], this.field5663[var14]);
                }
            }
            var10.method2267(var7);
            class114 var15 = class203.field2718;
            synchronized (class203.field2718) {
                class203.field2718.method615((byte) -110, (long) (this.field5670 |= arg2.field4307 << 29), var10);
            }
        }
        class396 var16 = var10.method2297(arg3, var7, true);
        if (var8 != null) {
            var16 = var8.method1130(arg0, false, 0, var7, arg1, var16, arg4, (byte) 2);
        }
        if (this.field5664 != 128 || this.field5653 != 128) {
            var16.method2264(this.field5664, this.field5653, this.field5664);
        }
        if (this.field5669 != 0) {
            if (this.field5669 == 90) {
                var16.method2269(4096);
            }
            if (this.field5669 == 180) {
                var16.method2269(8192);
            }
            if (this.field5669 == 270) {
                var16.method2269(12288);
            }
        }
        var16.method2267(arg5);
        return var16;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V", line = 1291)
    public static void method2447(byte arg0) {
        if (arg0 != 79) {
            method2447((byte) 90);
        }
        field5649 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLtq;)V", line = 1302)
    public final void method2448(byte arg0, class250 arg1) {
        int var3 = -94 % ((arg0 - 59) / 45);
        while (true) {
            int var4 = arg1.method1350(31351);
            if (var4 == 0) {
                field5655++;
                return;
            }
            this.method2449((byte) 120, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BILtq;)V", line = 1331)
    private final void method2449(byte arg0, int arg1, class250 arg2) {
        field5660++;
        if (arg0 <= 111) {
            return;
        }
        if (arg1 == 1) {
            this.field5665 = arg2.method1374(-2);
        } else if (arg1 == 2) {
            this.field5648 = arg2.method1374(-2);
        } else if (arg1 == 4) {
            this.field5664 = arg2.method1374(-2);
        } else if (arg1 == 5) {
            this.field5653 = arg2.method1374(-2);
        } else if (arg1 == 6) {
            this.field5669 = arg2.method1374(-2);
        } else if (arg1 == 7) {
            this.field5661 = arg2.method1350(31351);
        } else if (arg1 == 8) {
            this.field5652 = arg2.method1350(31351);
        } else if (arg1 == 9) {
            this.field5651 = true;
        } else if (arg1 == 10) {
            this.field5666 = true;
        } else if (arg1 == 40) {
            int var4 = arg2.method1350(31351);
            this.field5650 = new short[var4];
            this.field5667 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5650[var5] = (short) arg2.method1374(-2);
                this.field5667[var5] = (short) arg2.method1374(-2);
            }
            return;
        } else if (arg1 == 41) {
            int var6 = arg2.method1350(31351);
            this.field5658 = new short[var6];
            this.field5663 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5658[var7] = (short) arg2.method1374(-2);
                this.field5663[var7] = (short) arg2.method1374(-2);
            }
            return;
        }
    }
}
