import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class234 {

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "[I")
    private int[] field4076;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "[B")
    private byte[] field4070;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "[I")
    private int[] field4071;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Leb;")
    public static class230 field4069 = class68.method589(0, "Fps:");

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Leb;")
    private static class230 field4077 = class68.method589(0, "Loading sprites )2 ");

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "[I")
    public static int[] field4080 = new int[1000];

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Leb;")
    public static class230 field4075 = field4077;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)V")
    public static final void method1648(int arg0, boolean arg1) {
        field4078++;
        if (arg0 < 0) {
            return;
        }
        int var2 = (int) class145.field2599[arg0];
        int var3 = class244.field4196[arg0];
        int var4 = class46.field809[arg0];
        long var5 = class145.field2599[arg0];
        int var7 = class225.field3890[arg0];
        if (var7 >= 2000) {
            var7 -= 2000;
        }
        if (var7 == 28) {
            class245 var8 = class7.method67(var4, var3, (byte) -69);
            if (var8 != null) {
                class156.method1185(26248);
                class96.method814(var3, class95.method810(client.method1167(var8), -108), 2077415688, var4);
                class196.field3513 = 0;
                class68.field1275 = class60.method507((byte) -116, var8);
                if (class68.field1275 == null) {
                    class68.field1275 = class254.field4526;
                }
                if (var8.field4216) {
                    class44.field792 = class173.method1267((byte) 59, new class230[] { var8.field4364, class209.field3658 });
                    return;
                }
                class44.field792 = class173.method1267((byte) 59, new class230[] { class76.field1378, var8.field4211, class209.field3658 });
            }
            return;
        }
        if (var7 == 51) {
            class157.field2809++;
            class40.method352(var5, (byte) 48, var4, var3);
            class153.field2747.method978(108, 190);
            class153.field2747.method186(Integer.MAX_VALUE & (int) (var5 >>> 32), (byte) -115);
            class153.field2747.method186(class155.field2759 + var3, (byte) -118);
            class153.field2747.method181(-20053, class272.field4795 + var4);
        }
        if (var7 == 5) {
            class207.field3639++;
            class153.field2747.method978(115, 44);
            class153.field2747.method192(class159.field2829, false);
            class153.field2747.method146(var2, false);
            class153.field2747.method146(var4, false);
            class153.field2747.method165(var3, 1380186760);
            class153.field2747.method191(49, class163.field2915);
            class96.field1728 = 0;
            class190.field3350 = class155.method1183(var3, 17);
            class36.field681 = var4;
        }
        if (!arg1) {
            return;
        }
        if (var7 == 32) {
            class260 var9 = class230.field4011[var2];
            if (var9 != null) {
                class15.method208(1, class56.field1033.field2296[0], 0, false, 2, var9.field2296[0], var9.field2253[0], 1, 118, 0, 0, class56.field1033.field2253[0]);
                class33.field600 = 0;
                class203.field3580 = 2;
                class245.field4277++;
                class76.field1380 = class92.field1657;
                class27.field505 = class225.field3886;
                class153.field2747.method978(69, 218);
                class153.field2747.method186(var2, (byte) -115);
            }
        }
        if (var7 == 34) {
            class34.field626++;
            boolean var10 = class15.method208(0, class56.field1033.field2296[0], 0, false, 2, var4, var3, 0, 122, 0, 0, class56.field1033.field2253[0]);
            if (!var10) {
                class15.method208(1, class56.field1033.field2296[0], 0, false, 2, var4, var3, 1, 97, 0, 0, class56.field1033.field2253[0]);
            }
            class27.field505 = class225.field3886;
            class76.field1380 = class92.field1657;
            class33.field600 = 0;
            class203.field3580 = 2;
            class153.field2747.method978(-126, 214);
            class153.field2747.method146(var2, false);
            class153.field2747.method181(-20053, class159.field2829);
            class153.field2747.method192(var4 + class272.field4795, false);
            class153.field2747.method181(-20053, class155.field2759 + var3);
            class153.field2747.method165(class163.field2915, 1380186760);
        }
        if (var7 == 18) {
            class200.method1410(!arg1);
        }
        if (var7 == 1006) {
            class203.field3580 = 2;
            class76.field1380 = class92.field1657;
            class33.field600 = 0;
            class127.field2219++;
            class27.field505 = class225.field3886;
            class153.field2747.method978(-127, 60);
            class153.field2747.method192(var2, false);
        }
        if (var7 == 59) {
            class260 var12 = class230.field4011[var2];
            if (var12 != null) {
                class15.method208(1, class56.field1033.field2296[0], 0, false, 2, var12.field2296[0], var12.field2253[0], 1, 123, 0, 0, class56.field1033.field2253[0]);
                class76.field1380 = class92.field1657;
                class203.field3580 = 2;
                class33.field600 = 0;
                class185.field3246++;
                class27.field505 = class225.field3886;
                class153.field2747.method978(-127, 54);
                class153.field2747.method192(var2, false);
            }
        }
        if (var7 == 36 && class265.field4706 == null) {
            class34.method316(var3, (byte) 15, var4);
            class265.field4706 = class7.method67(var4, var3, (byte) -69);
            class92.method777((byte) -65, class265.field4706);
        }
        if (var7 == 22) {
            class153.field2747.method978(38, 57);
            class153.field2747.method146(var4, false);
            class243.field4160++;
            class153.field2747.method191(-127, var3);
            class153.field2747.method146(var2, false);
            class96.field1728 = 0;
            class190.field3350 = class155.method1183(var3, 17);
            class36.field681 = var4;
        }
        if (var7 == 14) {
            class153.field2747.method978(119, 144);
            class153.field2747.method181(-20053, var4);
            class226.field3902++;
            class153.field2747.method186(var2, (byte) -124);
            class153.field2747.method186(class225.field3891, (byte) -118);
            class153.field2747.method156(2, class35.field659);
            class153.field2747.method176(var3, false);
            class153.field2747.method186(class37.field683, (byte) -122);
            class96.field1728 = 0;
            class190.field3350 = class155.method1183(var3, 17);
            class36.field681 = var4;
        }
        if (var7 == 7) {
            class153.field2747.method978(57, 235);
            class5.field67++;
            class153.field2747.method192(var2, false);
            class153.field2747.method192(var4, false);
            class153.field2747.method191(-92, var3);
            class96.field1728 = 0;
            class190.field3350 = class155.method1183(var3, 17);
            class36.field681 = var4;
        }
        if (var7 == 48) {
            class260 var13 = class230.field4011[var2];
            if (var13 != null) {
                class15.method208(1, class56.field1033.field2296[0], 0, false, 2, var13.field2296[0], var13.field2253[0], 1, 98, 0, 0, class56.field1033.field2253[0]);
                class203.field3580 = 2;
                class33.field600 = 0;
                class24.field465++;
                class27.field505 = class225.field3886;
                class76.field1380 = class92.field1657;
                class153.field2747.method978(92, 55);
                class153.field2747.method181(-20053, var2);
            }
        }
        if (var7 == 41) {
            class213.field3690++;
            class40.method352(var5, (byte) 48, var4, var3);
            class153.field2747.method978(78, 131);
            class153.field2747.method146(var3 + class155.field2759, false);
            class153.field2747.method192(class272.field4795 + var4, false);
            class153.field2747.method146(Integer.MAX_VALUE & (int) (var5 >>> 32), false);
        }
        if (var7 == 9) {
            boolean var14 = class15.method208(0, class56.field1033.field2296[0], 0, false, 2, var4, var3, 0, 93, 0, 0, class56.field1033.field2253[0]);
            if (!var14) {
                class15.method208(1, class56.field1033.field2296[0], 0, false, 2, var4, var3, 1, 113, 0, 0, class56.field1033.field2253[0]);
            }
            class27.field505 = class225.field3886;
            class33.field600 = 0;
            class203.field3580 = 2;
            class141.field2538++;
            class76.field1380 = class92.field1657;
            class153.field2747.method978(15, 239);
            class153.field2747.method181(-20053, var2);
            class153.field2747.method186(class272.field4795 + var4, (byte) -115);
            class153.field2747.method181(-20053, class155.field2759 + var3);
        }
        if (var7 == 12) {
            class260 var16 = class230.field4011[var2];
            if (var16 != null) {
                class15.method208(1, class56.field1033.field2296[0], 0, false, 2, var16.field2296[0], var16.field2253[0], 1, 125, 0, 0, class56.field1033.field2253[0]);
                class76.field1380 = class92.field1657;
                class203.field3580 = 2;
                class33.field600 = 0;
                class27.field505 = class225.field3886;
                class153.field2747.method978(-127, 127);
                class189.field3316++;
                class153.field2747.method181(-20053, var2);
            }
        }
        if (var7 == 23) {
            class153.field2747.method978(-128, 125);
            class153.field2747.method192(var2, false);
            class23.field448++;
            class153.field2747.method165(var3, 1380186760);
            class153.field2747.method192(var4, !arg1);
            class96.field1728 = 0;
            class190.field3350 = class155.method1183(var3, 17);
            class36.field681 = var4;
        }
        if (var7 == 2) {
            class136.field2452++;
            boolean var17 = class15.method208(0, class56.field1033.field2296[0], 0, false, 2, var4, var3, 0, 109, 0, 0, class56.field1033.field2253[0]);
            if (!var17) {
                class15.method208(1, class56.field1033.field2296[0], 0, false, 2, var4, var3, 1, 108, 0, 0, class56.field1033.field2253[0]);
            }
            class76.field1380 = class92.field1657;
            class27.field505 = class225.field3886;
            class203.field3580 = 2;
            class33.field600 = 0;
            class153.field2747.method978(63, 79);
            class153.field2747.method181(-20053, class155.field2759 + var3);
            class153.field2747.method192(class225.field3891, false);
            class153.field2747.method146(var2, false);
            class153.field2747.method146(class37.field683, !arg1);
            class153.field2747.method146(class272.field4795 + var4, false);
            class153.field2747.method165(class35.field659, 1380186760);
        }
        if (var7 == 46) {
            class24.field464++;
            class153.field2747.method978(-128, 233);
            class153.field2747.method146(var4, false);
            class153.field2747.method146(var2, false);
            class153.field2747.method165(var3, 1380186760);
            class96.field1728 = 0;
            class190.field3350 = class155.method1183(var3, 17);
            class36.field681 = var4;
        }
        if (var7 == 50) {
            class260 var19 = class230.field4011[var2];
            if (var19 != null) {
                class15.method208(1, class56.field1033.field2296[0], 0, false, 2, var19.field2296[0], var19.field2253[0], 1, 108, 0, 0, class56.field1033.field2253[0]);
                class33.field600 = 0;
                class27.field505 = class225.field3886;
                class266.field4726++;
                class203.field3580 = 2;
                class76.field1380 = class92.field1657;
                class153.field2747.method978(-126, 139);
                class153.field2747.method191(48, class163.field2915);
                class153.field2747.method186(class159.field2829, (byte) -118);
                class153.field2747.method146(var2, false);
            }
        }
        if (var7 == 21) {
            class5.field73++;
            class40.method352(var5, (byte) 48, var4, var3);
            class153.field2747.method978(79, 59);
            class153.field2747.method186(class272.field4795 + var4, (byte) -116);
            class153.field2747.method192((int) (var5 >>> 32) & Integer.MAX_VALUE, false);
            class153.field2747.method186(class155.field2759 + var3, (byte) -116);
        }
        if (var7 == 1004) {
            class140.field2502++;
            class203.field3580 = 2;
            class33.field600 = 0;
            class27.field505 = class225.field3886;
            class76.field1380 = class92.field1657;
            class153.field2747.method978(8, 237);
            class153.field2747.method186(var2, (byte) -119);
        }
        if (var7 == 11) {
            boolean var20 = class15.method208(0, class56.field1033.field2296[0], 0, false, 2, var4, var3, 0, 102, 0, 0, class56.field1033.field2253[0]);
            class8.field136++;
            if (!var20) {
                class15.method208(1, class56.field1033.field2296[0], 0, false, 2, var4, var3, 1, 110, 0, 0, class56.field1033.field2253[0]);
            }
            class27.field505 = class225.field3886;
            class33.field600 = 0;
            class76.field1380 = class92.field1657;
            class203.field3580 = 2;
            class153.field2747.method978(-127, 174);
            class153.field2747.method186(var4 + class272.field4795, (byte) -117);
            class153.field2747.method192(var3 + class155.field2759, false);
            class153.field2747.method181(-20053, var2);
        }
        if (var7 == 1) {
            class245 var22 = class155.method1183(var3, 17);
            boolean var23 = true;
            if (var22.field4226 > 0) {
                var23 = class120.method947(false, var22);
            }
            if (var23) {
                class207.field3642++;
                class153.field2747.method978(-127, 165);
                class153.field2747.method165(var3, 1380186760);
            }
        }
        if (var7 == 8) {
            class109 var24 = class168.field2963[var2];
            if (var24 != null) {
                class15.method208(1, class56.field1033.field2296[0], 0, false, 2, var24.field2296[0], var24.field2253[0], 1, 117, 0, 0, class56.field1033.field2253[0]);
                class203.field3580 = 2;
                class76.field1380 = class92.field1657;
                class115.field2060++;
                class27.field505 = class225.field3886;
                class33.field600 = 0;
                class153.field2747.method978(107, 173);
                class153.field2747.method186(var2, (byte) -115);
            }
        }
        if (var7 == 49) {
            class109 var25 = class168.field2963[var2];
            if (var25 != null) {
                class88.field1541++;
                class15.method208(1, class56.field1033.field2296[0], 0, false, 2, var25.field2296[0], var25.field2253[0], 1, 98, 0, 0, class56.field1033.field2253[0]);
                class76.field1380 = class92.field1657;
                class203.field3580 = 2;
                class33.field600 = 0;
                class27.field505 = class225.field3886;
                class153.field2747.method978(-126, 153);
                class153.field2747.method146(class37.field683, false);
                class153.field2747.method192(class225.field3891, !arg1);
                class153.field2747.method146(var2, !arg1);
                class153.field2747.method156(2, class35.field659);
            }
        }
        if (var7 == 40) {
            class40.method352(var5, (byte) 48, var4, var3);
            class16.field366++;
            class153.field2747.method978(-127, 211);
            class153.field2747.method146(class272.field4795 + var4, false);
            class153.field2747.method186(Integer.MAX_VALUE & (int) (var5 >>> 32), (byte) -119);
            class153.field2747.method146(class155.field2759 + var3, false);
        }
        if (var7 == 24 || var7 == 1001) {
            class184.method1322((byte) -90, var4, class192.field3388[arg0], var3, var2);
        }
        if (var7 == 20) {
            class260 var26 = class230.field4011[var2];
            if (var26 != null) {
                class111.field1990++;
                class15.method208(1, class56.field1033.field2296[0], 0, false, 2, var26.field2296[0], var26.field2253[0], 1, 117, 0, 0, class56.field1033.field2253[0]);
                class33.field600 = 0;
                class76.field1380 = class92.field1657;
                class27.field505 = class225.field3886;
                class203.field3580 = 2;
                class153.field2747.method978(75, 51);
                class153.field2747.method181(-20053, var2);
            }
        }
        if (var7 == 42) {
            class66.field1243++;
            class153.field2747.method978(64, 232);
            class153.field2747.method176(var3, false);
            class153.field2747.method176(class163.field2915, !arg1);
            class153.field2747.method192(var4, false);
            class153.field2747.method181(-20053, class159.field2829);
        }
        if (var7 == 13 && class40.method352(var5, (byte) 48, var4, var3)) {
            class155.field2765++;
            class153.field2747.method978(-128, 161);
            class153.field2747.method146(class155.field2759 + var3, !arg1);
            class153.field2747.method192((int) (var5 >>> 32) & Integer.MAX_VALUE, false);
            class153.field2747.method181(-20053, class272.field4795 + var4);
            class153.field2747.method181(-20053, class159.field2829);
            class153.field2747.method165(class163.field2915, 1380186760);
        }
        if (var7 == 4) {
            class109 var27 = class168.field2963[var2];
            if (var27 != null) {
                class167.field2943++;
                class15.method208(1, class56.field1033.field2296[0], 0, false, 2, var27.field2296[0], var27.field2253[0], 1, 126, 0, 0, class56.field1033.field2253[0]);
                class76.field1380 = class92.field1657;
                class33.field600 = 0;
                class203.field3580 = 2;
                class27.field505 = class225.field3886;
                class153.field2747.method978(6, 0);
                class153.field2747.method146(var2, false);
            }
        }
        if (var7 == 58) {
            class260 var28 = class230.field4011[var2];
            if (var28 != null) {
                class78.field1422++;
                class15.method208(1, class56.field1033.field2296[0], 0, false, 2, var28.field2296[0], var28.field2253[0], 1, 96, 0, 0, class56.field1033.field2253[0]);
                class76.field1380 = class92.field1657;
                class27.field505 = class225.field3886;
                class203.field3580 = 2;
                class33.field600 = 0;
                class153.field2747.method978(-128, 69);
                class153.field2747.method146(class37.field683, false);
                class153.field2747.method165(class35.field659, 1380186760);
                class153.field2747.method181(-20053, class225.field3891);
                class153.field2747.method146(var2, false);
            }
        }
        if (var7 == 57) {
            class109 var29 = class168.field2963[var2];
            if (var29 != null) {
                class114.field2049++;
                class15.method208(1, class56.field1033.field2296[0], 0, false, 2, var29.field2296[0], var29.field2253[0], 1, 100, 0, 0, class56.field1033.field2253[0]);
                class33.field600 = 0;
                class27.field505 = class225.field3886;
                class203.field3580 = 2;
                class76.field1380 = class92.field1657;
                class153.field2747.method978(-126, 126);
                class153.field2747.method186(var2, (byte) -128);
            }
        }
        if (var7 == 19) {
            class260 var30 = class230.field4011[var2];
            if (var30 != null) {
                class142.field2546++;
                class15.method208(1, class56.field1033.field2296[0], 0, false, 2, var30.field2296[0], var30.field2253[0], 1, 100, 0, 0, class56.field1033.field2253[0]);
                class76.field1380 = class92.field1657;
                class203.field3580 = 2;
                class27.field505 = class225.field3886;
                class33.field600 = 0;
                class153.field2747.method978(83, 53);
                class153.field2747.method186(var2, (byte) -122);
            }
        }
        if (var7 == 35) {
            class109 var31 = class168.field2963[var2];
            if (var31 != null) {
                class15.method208(1, class56.field1033.field2296[0], 0, false, 2, var31.field2296[0], var31.field2253[0], 1, 106, 0, 0, class56.field1033.field2253[0]);
                class27.field505 = class225.field3886;
                class203.field3580 = 2;
                class269.field4769++;
                class33.field600 = 0;
                class76.field1380 = class92.field1657;
                class153.field2747.method978(47, 184);
                class153.field2747.method186(var2, (byte) -113);
            }
        }
        if (var7 == 6) {
            class109 var32 = class168.field2963[var2];
            if (var32 != null) {
                class15.method208(1, class56.field1033.field2296[0], 0, false, 2, var32.field2296[0], var32.field2253[0], 1, 101, 0, 0, class56.field1033.field2253[0]);
                class27.field505 = class225.field3886;
                class25.field471++;
                class203.field3580 = 2;
                class76.field1380 = class92.field1657;
                class33.field600 = 0;
                class153.field2747.method978(-125, 83);
                class153.field2747.method176(class163.field2915, false);
                class153.field2747.method192(var2, !arg1);
                class153.field2747.method181(-20053, class159.field2829);
            }
        }
        if (var7 == 44) {
            class153.field2747.method978(65, 39);
            class266.field4725++;
            class153.field2747.method192(var2, false);
            class153.field2747.method181(-20053, var4);
            class153.field2747.method165(var3, 1380186760);
            class96.field1728 = 0;
            class190.field3350 = class155.method1183(var3, 17);
            class36.field681 = var4;
        }
        if (var7 == 1005) {
            class40.method352(var5, (byte) 48, var4, var3);
            class153.field2747.method978(-126, 183);
            class226.field3897++;
            class153.field2747.method181(-20053, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class153.field2747.method192(class155.field2759 + var3, !arg1);
            class153.field2747.method146(class272.field4795 + var4, false);
        }
        if (var7 == 37) {
            class260 var33 = class230.field4011[var2];
            if (var33 != null) {
                class15.method208(1, class56.field1033.field2296[0], 0, false, 2, var33.field2296[0], var33.field2253[0], 1, 96, 0, 0, class56.field1033.field2253[0]);
                class76.field1380 = class92.field1657;
                class27.field505 = class225.field3886;
                class33.field600 = 0;
                class247.field4385++;
                class203.field3580 = 2;
                class153.field2747.method978(82, 114);
                class153.field2747.method192(var2, false);
            }
        }
        if (var7 == 45) {
            class144.field2582++;
            class153.field2747.method978(26, 11);
            class153.field2747.method181(-20053, var4);
            class153.field2747.method176(var3, false);
            class153.field2747.method181(-20053, var2);
            class96.field1728 = 0;
            class190.field3350 = class155.method1183(var3, 17);
            class36.field681 = var4;
        }
        if (var7 == 10) {
            class205.field3609++;
            boolean var34 = class15.method208(0, class56.field1033.field2296[0], 0, false, 2, var4, var3, 0, 120, 0, 0, class56.field1033.field2253[0]);
            if (!var34) {
                class15.method208(1, class56.field1033.field2296[0], 0, false, 2, var4, var3, 1, 127, 0, 0, class56.field1033.field2253[0]);
            }
            class33.field600 = 0;
            class76.field1380 = class92.field1657;
            class27.field505 = class225.field3886;
            class203.field3580 = 2;
            class153.field2747.method978(2, 33);
            class153.field2747.method186(class155.field2759 + var3, (byte) -113);
            class153.field2747.method181(-20053, var2);
            class153.field2747.method181(-20053, var4 + class272.field4795);
        }
        if (var7 == 39) {
            class109 var36 = class168.field2963[var2];
            if (var36 != null) {
                class54.field934++;
                class15.method208(1, class56.field1033.field2296[0], 0, false, 2, var36.field2296[0], var36.field2253[0], 1, 120, 0, 0, class56.field1033.field2253[0]);
                class76.field1380 = class92.field1657;
                class33.field600 = 0;
                class27.field505 = class225.field3886;
                class203.field3580 = 2;
                class153.field2747.method978(48, 73);
                class153.field2747.method146(var2, false);
            }
        }
        if (var7 == 33) {
            class156.method1185(26248);
            class245 var37 = class155.method1183(var3, 17);
            class196.field3513 = 1;
            class225.field3891 = var4;
            class35.field659 = var3;
            class37.field683 = var2;
            class92.method777((byte) -65, var37);
            class153.field2730 = class173.method1267((byte) 59, new class230[] { class88.field1542, class214.method1484(var2, -1).field191, class209.field3658 });
            if (class153.field2730 == null) {
                class153.field2730 = class171.field3034;
            }
            return;
        }
        if (var7 == 1003) {
            class245 var38 = class155.method1183(var3, 17);
            if (var38 == null || var38.field4215[var4] < 100000) {
                class153.field2747.method978(-125, 60);
                class153.field2747.method192(var2, false);
                class127.field2219++;
            } else {
                class227.method1565(class89.field1580, (byte) 82, 0, class173.method1267((byte) 59, new class230[] { class37.method340(var38.field4215[var4], (byte) -26), class248.field4400, class214.method1484(var2, -1).field191 }));
            }
            class96.field1728 = 0;
            class190.field3350 = class155.method1183(var3, 17);
            class36.field681 = var4;
        }
        if (var7 == 25) {
            class204.field3603++;
            class153.field2747.method978(-126, 21);
            class153.field2747.method192(var4, false);
            class153.field2747.method146(var2, false);
            class153.field2747.method165(var3, 1380186760);
            class96.field1728 = 0;
            class190.field3350 = class155.method1183(var3, 17);
            class36.field681 = var4;
        }
        if (var7 == 31) {
            class153.field2747.method978(54, 65);
            class153.field2747.method192(var2, !arg1);
            class153.field2747.method146(var4, false);
            class153.field2747.method176(var3, false);
            class96.field1728 = 0;
            class190.field3350 = class155.method1183(var3, 17);
            class191.field3364++;
            class36.field681 = var4;
        }
        if (var7 == 16) {
            class244.method1700(class124.field2174, var4, var3);
        }
        if (var7 == 43) {
            class245.field4321 = true;
            class244.method1700(class124.field2174, var4, var3);
        }
        if (var7 == 29) {
            class153.field2747.method978(7, 165);
            class207.field3642++;
            class153.field2747.method165(var3, 1380186760);
            class245 var39 = class155.method1183(var3, 17);
            if (var39.field4225 != null && var39.field4225[0][0] == 5) {
                int var40 = var39.field4225[0][1];
                class99.field1838[var40] = 1 - class99.field1838[var40];
                class261.method1820((byte) -54, var40);
            }
        }
        if (var7 == 3) {
            class260 var41 = class230.field4011[var2];
            if (var41 != null) {
                class15.method208(1, class56.field1033.field2296[0], 0, false, 2, var41.field2296[0], var41.field2253[0], 1, 94, 0, 0, class56.field1033.field2253[0]);
                class27.field505 = class225.field3886;
                class33.field600 = 0;
                class203.field3580 = 2;
                class76.field1380 = class92.field1657;
                class153.field2747.method978(-126, 213);
                class37.field696++;
                class153.field2747.method192(var2, false);
            }
        }
        if (var7 == 47) {
            class153.field2747.method978(45, 165);
            class153.field2747.method165(var3, 1380186760);
            class245 var42 = class155.method1183(var3, 17);
            class207.field3642++;
            if (var42.field4225 != null && var42.field4225[0][0] == 5) {
                int var43 = var42.field4225[0][1];
                if (class99.field1838[var43] != var42.field4359[0]) {
                    class99.field1838[var43] = var42.field4359[0];
                    class261.method1820((byte) -40, var43);
                }
            }
        }
        if (var7 == 17) {
            class191.field3362++;
            boolean var44 = class15.method208(0, class56.field1033.field2296[0], 0, false, 2, var4, var3, 0, 102, 0, 0, class56.field1033.field2253[0]);
            if (!var44) {
                class15.method208(1, class56.field1033.field2296[0], 0, false, 2, var4, var3, 1, 96, 0, 0, class56.field1033.field2253[0]);
            }
            class203.field3580 = 2;
            class33.field600 = 0;
            class27.field505 = class225.field3886;
            class76.field1380 = class92.field1657;
            class153.field2747.method978(22, 66);
            class153.field2747.method146(class272.field4795 + var4, false);
            class153.field2747.method146(class155.field2759 + var3, !arg1);
            class153.field2747.method146(var2, false);
        }
        if (var7 == 26) {
            class153.field2747.method978(-126, 94);
            class185.field3249++;
            class153.field2747.method146(var2, !arg1);
            class153.field2747.method191(-73, var3);
            class153.field2747.method146(var4, false);
            class96.field1728 = 0;
            class190.field3350 = class155.method1183(var3, 17);
            class36.field681 = var4;
        }
        if (var7 == 30) {
            class133.field2402++;
            class153.field2747.method978(73, 76);
            class153.field2747.method186(var2, (byte) -110);
            class153.field2747.method192(var4, false);
            class153.field2747.method176(var3, false);
            class96.field1728 = 0;
            class190.field3350 = class155.method1183(var3, 17);
            class36.field681 = var4;
        }
        if (var7 == 38 && class40.method352(var5, (byte) 48, var4, var3)) {
            class153.field2747.method978(104, 9);
            class153.field2747.method192(class37.field683, !arg1);
            class153.field2747.method192((int) (var5 >>> 32) & Integer.MAX_VALUE, !arg1);
            class153.field2747.method156(2, class35.field659);
            class259.field4578++;
            class153.field2747.method181(-20053, var3 + class155.field2759);
            class153.field2747.method181(-20053, class225.field3891);
            class153.field2747.method146(class272.field4795 + var4, false);
        }
        if (var7 == 15) {
            boolean var46 = class15.method208(0, class56.field1033.field2296[0], 0, false, 2, var4, var3, 0, 109, 0, 0, class56.field1033.field2253[0]);
            class134.field2425++;
            if (!var46) {
                class15.method208(1, class56.field1033.field2296[0], 0, false, 2, var4, var3, 1, 121, 0, 0, class56.field1033.field2253[0]);
            }
            class33.field600 = 0;
            class203.field3580 = 2;
            class76.field1380 = class92.field1657;
            class27.field505 = class225.field3886;
            class153.field2747.method978(-125, 47);
            class153.field2747.method181(-20053, class272.field4795 + var4);
            class153.field2747.method186(var2, (byte) -120);
            class153.field2747.method192(class155.field2759 + var3, false);
        }
        if (var7 == 1002) {
            class203.field3580 = 2;
            class33.field600 = 0;
            class76.field1380 = class92.field1657;
            class27.field505 = class225.field3886;
            class109 var48 = class168.field2963[var2];
            if (var48 != null) {
                class97 var49 = var48.field1956;
                if (var49.field1787 != null) {
                    var49 = var49.method825((byte) 68);
                }
                if (var49 != null) {
                    class153.field2747.method978(30, 112);
                    class167.field2942++;
                    class153.field2747.method186(var49.field1751, (byte) -124);
                }
            }
        }
        if (class196.field3513 != 0) {
            class196.field3513 = 0;
            class92.method777((byte) -65, class155.method1183(class35.field659, 17));
        }
        if (class184.field3231) {
            class156.method1185(26248);
        }
        if (class190.field3350 != null && class96.field1728 == 0) {
            class92.method777((byte) -65, class190.field3350);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II[B[BII)I")
    public final int method1649(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        field4073++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = arg0 + arg4;
        if (arg5 != -11752) {
            return -81;
        }
        int var8 = 0;
        int var9 = arg1;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 < 0) {
                var8 = this.field4076[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field4076[var8]) < 0) {
                arg3[arg4++] = (byte) (~var11);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field4076[var8];
            }
            int var12;
            if ((var12 = this.field4076[var8]) < 0) {
                arg3[arg4++] = (byte) (~var12);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field4076[var8];
            }
            int var13;
            if ((var13 = this.field4076[var8]) < 0) {
                arg3[arg4++] = (byte) (~var13);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field4076[var8];
            }
            int var14;
            if ((var14 = this.field4076[var8]) < 0) {
                arg3[arg4++] = (byte) (~var14);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field4076[var8];
            }
            int var15;
            if ((var15 = this.field4076[var8]) < 0) {
                arg3[arg4++] = (byte) (~var15);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field4076[var8];
            }
            int var16;
            if ((var16 = this.field4076[var8]) < 0) {
                arg3[arg4++] = (byte) (~var16);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field4076[var8];
            }
            int var17;
            if ((var17 = this.field4076[var8]) < 0) {
                arg3[arg4++] = (byte) (~var17);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field4076[var8];
            }
            int var18;
            if ((var18 = this.field4076[var8]) < 0) {
                arg3[arg4++] = (byte) (~var18);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg1;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II[B[BII)I")
    public final int method1650(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        if (arg4 != 24) {
            return 127;
        }
        int var7 = arg1 << 3;
        int var8 = arg0 + arg5;
        int var9 = 0;
        field4074++;
        while (arg5 < var8) {
            int var10 = arg2[arg5] & 0xFF;
            int var11 = this.field4071[var10];
            byte var12 = this.field4070[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var7 & 0x7;
            int var14 = var9 & -var13 >> 31;
            int var15 = var7 >> 3;
            int var16 = (var13 + var12 - 1 >> 3) + var15;
            var7 += var12;
            int var17 = var13 + 24;
            arg3[var15] = (byte) (var9 = class177.method1290(var14, var11 >>> var17));
            if (var16 > var15) {
                var13 = var17 - 8;
                var15++;
                arg3[var15] = (byte) (var9 = var11 >>> var13);
                if (var16 > var15) {
                    var15++;
                    var13 -= 8;
                    arg3[var15] = (byte) (var9 = var11 >>> var13);
                    if (var16 > var15) {
                        var13 -= 8;
                        var15++;
                        arg3[var15] = (byte) (var9 = var11 >>> var13);
                        if (var16 > var15) {
                            var13 -= 8;
                            var15++;
                            arg3[var15] = (byte) (var9 = var11 << -var13);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var7 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BIIII)V")
    public static final void method1651(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field4079++;
        if (arg0 != -65) {
            field4075 = null;
        }
        if ((arg2 - arg1) >= class78.field1404 && arg1 + arg2 <= class42.field769 && class15.field345 <= (arg3 - arg1) && arg1 + arg3 <= class259.field4587) {
            class223.method1534(0, arg1, arg3, arg4, arg2);
        } else {
            class31.method286(arg4, (byte) -122, arg2, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lka;IIIIIII)V")
    public static final void method1652(class245 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class133.field2416) {
            class267.field4742 = 32;
        } else {
            class267.field4742 = 0;
        }
        class133.field2416 = false;
        field4072++;
        if (class134.field2419 != 0) {
            if (arg6 <= arg7 && (arg6 + 16) > arg7 && arg3 >= arg1 && arg3 < (arg1 + 16)) {
                arg0.field4351 -= 4;
                class92.method777((byte) -65, arg0);
            } else if (arg7 >= arg6 && arg6 + 16 > arg7 && arg3 >= (arg1 - (16 - arg5)) && arg1 + arg5 > arg3) {
                arg0.field4351 += 4;
                class92.method777((byte) -65, arg0);
            } else if (arg7 >= arg6 - class267.field4742 && (arg6 + class267.field4742 + 16) > arg7 && (arg1 + 16) <= arg3 && arg3 < arg1 + arg5 - 16) {
                int var8 = (arg5 - 32) * arg5 / arg4;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg3 - (var8 / 2) - (arg1 + 16);
                int var10 = arg5 - var8 - 32;
                arg0.field4351 = (arg4 - arg5) * var9 / var10;
                class92.method777((byte) -65, arg0);
                class133.field2416 = true;
            }
        }
        if (class267.field4743 != 0) {
            int var11 = arg0.field4325;
            if ((arg6 - var11) <= arg7 && arg3 >= arg1 && arg6 + 16 > arg7 && arg3 <= arg1 + arg5) {
                arg0.field4351 += class267.field4743 * 45;
                class92.method777((byte) -65, arg0);
            }
        }
        int var12 = 63 % ((59 - arg2) / 43);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    public static void method1653(byte arg0) {
        field4075 = null;
        field4077 = null;
        int var1 = 23 % ((-arg0 - 24) / 33);
        field4080 = null;
        field4069 = null;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "([B)V")
    public class234(byte[] arg0) {
        int var2 = arg0.length;
        this.field4076 = new int[8];
        int[] var3 = new int[33];
        this.field4070 = arg0;
        this.field4071 = new int[var2];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field4071[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class177.method1290(var11, var12);
                    }
                    var9 = var8 | var7;
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field4076[var14] == 0) {
                            this.field4076[var14] = var4;
                        }
                        var14 = this.field4076[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field4076.length) {
                        int[] var18 = new int[this.field4076.length * 2];
                        for (int var19 = 0; var19 < this.field4076.length; var19++) {
                            var18[var19] = this.field4076[var19];
                        }
                        this.field4076 = var18;
                    }
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field4076[var14] = ~var5;
            }
        }
    }
}
