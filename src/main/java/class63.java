import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class63 extends class513 implements class233 {

    @OriginalMember(owner = "client!fw", name = "x", descriptor = "I")
    private int field862 = -1;

    @OriginalMember(owner = "client!fw", name = "A", descriptor = "I")
    private int field865 = -1;

    @OriginalMember(owner = "client!fw", name = "F", descriptor = "Lhk;")
    private class111 field870;

    @OriginalMember(owner = "client!fw", name = "w", descriptor = "I")
    private int field861;

    @OriginalMember(owner = "client!fw", name = "E", descriptor = "I")
    public int field869;

    @OriginalMember(owner = "client!fw", name = "J", descriptor = "I")
    public int field874;

    @OriginalMember(owner = "client!fw", name = "G", descriptor = "I")
    private int field871;

    @OriginalMember(owner = "client!fw", name = "y", descriptor = "I")
    private int field863;

    @OriginalMember(owner = "client!fw", name = "v", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!fw", name = "z", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!fw", name = "B", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!fw", name = "C", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!fw", name = "D", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!fw", name = "H", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!fw", name = "I", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V", line = 4)
    public final void method129(int arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field865, this.field862, 36161, 0);
        field872++;
        this.field862 = -1;
        if (arg0 > -44) {
            this.field874 = 83;
        }
        this.field865 = -1;
    }

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "(I)J", line = 17)
    public static final long method433(int arg0) {
        field873++;
        return arg0 == 1 ? class598.field8377.method1361((byte) -121) : 24L;
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(IBI)V", line = 28)
    public final void method434(int arg0, byte arg1, int arg2) {
        if (arg1 == -1) {
            OpenGL.glFramebufferRenderbufferEXT(arg0, arg2, 36161, this.field871);
            field868++;
            this.field865 = arg0;
            this.field862 = arg2;
        }
    }

    @OriginalMember(owner = "client!fw", name = "finalize", descriptor = "()V", line = 44)
    protected final void finalize() throws Throwable {
        this.method435(48);
        field866++;
        super.finalize();
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lhk;III)V", line = 936)
    public class63(class111 arg0, int arg1, int arg2, int arg3) {
        this.field870 = arg0;
        this.field861 = arg1;
        this.field869 = arg2;
        this.field874 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class78.field1108, 0);
        this.field871 = class78.field1108[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field871);
        OpenGL.glRenderbufferStorageEXT(36161, this.field861, this.field869, this.field874);
        this.field863 = this.field874 * this.field869 * this.field870.method969(this.field861, 103);
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lhk;IIII)V", line = 951)
    public class63(class111 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field861 = arg1;
        this.field870 = arg0;
        this.field874 = arg3;
        this.field869 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class78.field1108, 0);
        this.field871 = class78.field1108[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field871);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field861, this.field869, this.field874);
        this.field863 = this.field874 * this.field869 * this.field870.method969(this.field861, 31);
    }

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "(I)V", line = 69)
    public final void method435(int arg0) {
        if (arg0 <= 19) {
            return;
        }
        if (this.field871 > 0) {
            this.field870.method991(this.field863, this.field871, false);
            this.field871 = 0;
        }
        field864++;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lod;III)V", line = 86)
    public static final void method436(class534 arg0, int arg1, int arg2, int arg3) {
        field860++;
        if (arg0 == null || class208.field3119.field8920 == arg0) {
            return;
        }
        int var4 = arg0.field7236;
        int var5 = arg0.field7223;
        int var6 = arg0.field7229;
        int var7 = (int) arg0.field7231;
        long var8 = arg0.field7231;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        if (var6 == 30) {
            class641.field8816++;
            class487.field6579 = 2;
            class462.field6289 = arg3;
            class616.field8582 = arg1;
            class427.field5828 = 0;
            class537 var10 = class476.method2729(class385.field5259, (byte) -46, class551.field7498);
            var10.field7295.method791(-550441944, class400.field5510 + var5);
            var10.field7295.method791(-550441944, class217.field3198 + var4);
            var10.field7295.method800(class789.field10821.method1531(118, 82) ? 1 : 0, 128);
            var10.field7295.method790(var7, 65280);
            class173.method1314(false, var10);
            class488.method2783(var5, var4, (byte) -37);
        }
        if (var6 == 58) {
            class755 var11 = (class755) class664.field9216.method337((long) var7, 1);
            if (var11 != null) {
                class199.field3013++;
                class666 var12 = var11.field10414;
                class462.field6289 = arg3;
                class427.field5828 = 0;
                class616.field8582 = arg1;
                class487.field6579 = 2;
                class537 var13 = class476.method2729(class628.field8732, (byte) -46, class551.field7498);
                var13.field7295.method781(111, var7);
                var13.field7295.method780(class789.field10821.method1531(68, 82) ? 1 : 0, true);
                class173.method1314(false, var13);
                class297.method1910(0, var12.method2342((byte) 92), true, var12.field5304[0], var12.method2342((byte) 111), var12.field5308[0], -2, 0, 125);
            }
        }
        if (var6 == 51) {
            class771 var14 = class527.field7150[var7];
            if (var14 != null) {
                class616.field8582 = arg1;
                class487.field6579 = 2;
                class453.field6185++;
                class462.field6289 = arg3;
                class427.field5828 = 0;
                class537 var15 = class476.method2729(class277.field3830, (byte) -46, class551.field7498);
                var15.field7295.method800(class789.field10821.method1531(109, 82) ? 1 : 0, 128);
                var15.field7295.method745(var7, -2);
                class173.method1314(false, var15);
                class297.method1910(0, var14.method2342((byte) -120), true, var14.field5304[0], var14.method2342((byte) -7), var14.field5308[0], -2, 0, -31);
            }
        }
        if (var6 == 59) {
            class427.field5828 = 0;
            class462.field6289 = arg3;
            class616.field8582 = arg1;
            class276.field3822++;
            class487.field6579 = 2;
            class537 var16 = class476.method2729(class643.field8895, (byte) -46, class551.field7498);
            var16.field7295.method745(class400.field5510 + var5, -2);
            var16.field7295.method800(class789.field10821.method1531(102, 82) ? 1 : 0, 128);
            var16.field7295.method790((int) (var8 >>> 32) & Integer.MAX_VALUE, 65280);
            var16.field7295.method781(94, class217.field3198 + var4);
            class173.method1314(false, var16);
            class425.method2506(var5, -72, var8, var4);
        }
        if (var6 == 13) {
            class487.field6579 = 2;
            class462.field6289 = arg3;
            class616.field8582 = arg1;
            class427.field5828 = 0;
            class11.field182++;
            class537 var17 = class476.method2729(class87.field1203, (byte) -46, class551.field7498);
            var17.field7295.method791(-550441944, class217.field3198 + var4);
            var17.field7295.method790(var7, 65280);
            var17.field7295.method740(class789.field10821.method1531(108, 82) ? 1 : 0, (byte) 89);
            var17.field7295.method738(class342.field4609, (byte) 37);
            var17.field7295.method781(59, class657.field9100);
            var17.field7295.method790(class783.field10758, 65280);
            var17.field7295.method781(15, class400.field5510 + var5);
            class173.method1314(false, var17);
            class488.method2783(var5, var4, (byte) -37);
        }
        if (var6 == 49) {
            class427.field5828 = 0;
            class616.field8582 = arg1;
            class548.field7451++;
            class487.field6579 = 2;
            class462.field6289 = arg3;
            class537 var18 = class476.method2729(class342.field4610, (byte) -46, class551.field7498);
            var18.field7295.method745(Integer.MAX_VALUE & (int) (var8 >>> 32), -2);
            var18.field7295.method781(48, var5 + class400.field5510);
            var18.field7295.method790(class783.field10758, 65280);
            var18.field7295.method780(class789.field10821.method1531(71, 82) ? 1 : 0, true);
            var18.field7295.method759(class342.field4609, -117);
            var18.field7295.method745(class217.field3198 + var4, -2);
            var18.field7295.method745(class657.field9100, -2);
            class173.method1314(false, var18);
            class425.method2506(var5, -49, var8, var4);
        }
        if (var6 == 57) {
            class771 var19 = class527.field7150[var7];
            if (var19 != null) {
                class427.field5828 = 0;
                class487.field6579 = 2;
                class462.field6289 = arg3;
                class452.field6181++;
                class616.field8582 = arg1;
                class537 var20 = class476.method2729(class6.field119, (byte) -46, class551.field7498);
                var20.field7295.method754(class789.field10821.method1531(113, 82) ? 1 : 0, 39);
                var20.field7295.method790(var7, 65280);
                class173.method1314(false, var20);
                class297.method1910(0, var19.method2342((byte) 95), true, var19.field5304[0], var19.method2342((byte) 86), var19.field5308[0], -2, 0, -88);
            }
        }
        if (var6 == 19) {
            class427.field5828 = 0;
            class487.field6579 = 2;
            class462.field6289 = arg3;
            class616.field8582 = arg1;
            class639.field8800++;
            class537 var21 = class476.method2729(class509.field6993, (byte) -46, class551.field7498);
            var21.field7295.method780(class789.field10821.method1531(120, 82) ? 1 : 0, true);
            var21.field7295.method781(58, class400.field5510 + var5);
            var21.field7295.method781(94, var7);
            var21.field7295.method781(98, var4 + class217.field3198);
            class173.method1314(false, var21);
            class488.method2783(var5, var4, (byte) -37);
        }
        if (var6 == 4) {
            class771 var22 = class527.field7150[var7];
            if (var22 != null) {
                class427.field5828 = 0;
                class616.field8582 = arg1;
                class487.field6579 = 2;
                class469.field6347++;
                class462.field6289 = arg3;
                class537 var23 = class476.method2729(class218.field3214, (byte) -46, class551.field7498);
                var23.field7295.method740(class789.field10821.method1531(68, 82) ? 1 : 0, (byte) 71);
                var23.field7295.method790(var7, 65280);
                class173.method1314(false, var23);
                class297.method1910(0, var22.method2342((byte) 91), true, var22.field5304[0], var22.method2342((byte) 110), var22.field5308[0], -2, 0, 119);
            }
        }
        if (var6 == 12) {
            class616.field8582 = arg1;
            class427.field5828 = 0;
            class487.field6579 = 2;
            class462.field6289 = arg3;
            class539.field7317++;
            class537 var24 = class476.method2729(class334.field4515, (byte) -46, class551.field7498);
            var24.field7295.method780(class789.field10821.method1531(74, 82) ? 1 : 0, true);
            var24.field7295.method745(class400.field5510 + var5, -2);
            var24.field7295.method791(-550441944, class217.field3198 + var4);
            var24.field7295.method745((int) (var8 >>> 32) & Integer.MAX_VALUE, -2);
            class173.method1314(false, var24);
            class425.method2506(var5, -100, var8, var4);
        }
        if (var6 == 23 || var6 == 1001) {
            class736.method4083(var5, -26207, var4, arg0.field7233, var7);
        }
        if (var6 == 1010) {
            class487.field6579 = 2;
            class792.field10844++;
            class427.field5828 = 0;
            class462.field6289 = arg3;
            class616.field8582 = arg1;
            class537 var25 = class476.method2729(class523.field7087, (byte) -46, class551.field7498);
            var25.field7295.method754(class789.field10821.method1531(109, 82) ? 1 : 0, 25);
            var25.field7295.method790(class400.field5510 + var5, 65280);
            var25.field7295.method790(class217.field3198 + var4, 65280);
            var25.field7295.method781(124, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class173.method1314(false, var25);
            class425.method2506(var5, 115, var8, var4);
        }
        if (var6 == 8) {
            class17 var26 = class326.method2066(var4, var5, 87);
            if (var26 != null) {
                class200.method1443(false);
                class698 var27 = client.method2010(var26);
                class301.method1932(var27.field9641, (byte) 127, var27.method3889(true), var26);
                class508.field6980 = class195.method1413((byte) -43, var26);
                class420.field5726 = var26.field328 + "<col=ffffff>";
                if (class508.field6980 == null) {
                    class508.field6980 = "Null";
                }
            }
            return;
        }
        if (var6 == 20) {
            class487.field6579 = 1;
            class616.field8582 = arg1;
            class427.field5828 = 0;
            class481.field6501++;
            class462.field6289 = arg3;
            class537 var28 = class476.method2729(class407.field5587, (byte) -46, class551.field7498);
            var28.field7295.method790(class217.field3198 + var4, 65280);
            var28.field7295.method745(class400.field5510 + var5, -2);
            var28.field7295.method776(-125, class342.field4609);
            var28.field7295.method791(-550441944, class783.field10758);
            var28.field7295.method781(57, class657.field9100);
            class173.method1314(false, var28);
            class297.method1910(0, 1, true, var4, 1, var5, -4, 0, 124);
        }
        if (var6 == 47) {
            class462.field6289 = arg3;
            class394.field5441++;
            class427.field5828 = 0;
            class487.field6579 = 2;
            class616.field8582 = arg1;
            class537 var29 = class476.method2729(class356.field4855, (byte) -46, class551.field7498);
            var29.field7295.method790(class400.field5510 + var5, 65280);
            var29.field7295.method745(var7, -2);
            var29.field7295.method781(124, var4 + class217.field3198);
            var29.field7295.method740(class789.field10821.method1531(95, 82) ? 1 : 0, (byte) 45);
            class173.method1314(false, var29);
            class488.method2783(var5, var4, (byte) -37);
        }
        if (var6 == 25) {
            class771 var30 = class527.field7150[var7];
            if (var30 != null) {
                class616.field8582 = arg1;
                class427.field5828 = 0;
                class487.field6579 = 2;
                class323.field4422++;
                class462.field6289 = arg3;
                class537 var31 = class476.method2729(class366.field4969, (byte) -46, class551.field7498);
                var31.field7295.method800(class789.field10821.method1531(105, 82) ? 1 : 0, 128);
                var31.field7295.method791(-550441944, var7);
                class173.method1314(false, var31);
                class297.method1910(0, var30.method2342((byte) -84), true, var30.field5304[0], var30.method2342((byte) 95), var30.field5308[0], -2, 0, 122);
            }
        }
        if (var6 == 1009) {
            class462.field6289 = arg3;
            class616.field8582 = arg1;
            class487.field6579 = 2;
            class427.field5828 = 0;
            class755 var32 = (class755) class664.field9216.method337((long) var7, 1);
            if (var32 != null) {
                class666 var33 = var32.field10414;
                class568 var34 = var33.field9253;
                if (var34.field8023 != null) {
                    var34 = var34.method3283((byte) -120, class694.field9613);
                }
                if (var34 != null) {
                    class67.field985++;
                    class537 var35 = class476.method2729(class383.field5198, (byte) -46, class551.field7498);
                    var35.field7295.method781(67, var34.field8087);
                    class173.method1314(false, var35);
                }
            }
        }
        if (var6 == 3) {
            class755 var36 = (class755) class664.field9216.method337((long) var7, 1);
            if (var36 != null) {
                class427.field5828 = 0;
                class666 var37 = var36.field10414;
                class133.field2278++;
                class462.field6289 = arg3;
                class616.field8582 = arg1;
                class487.field6579 = 2;
                class537 var38 = class476.method2729(class395.field5452, (byte) -46, class551.field7498);
                var38.field7295.method791(-550441944, var7);
                var38.field7295.method800(class789.field10821.method1531(82, 82) ? 1 : 0, 128);
                class173.method1314(false, var38);
                class297.method1910(0, var37.method2342((byte) -113), true, var37.field5304[0], var37.method2342((byte) -15), var37.field5308[0], -2, 0, -11);
            }
        }
        if (var6 == 9) {
            class487.field6579 = 2;
            class194.field2954++;
            class462.field6289 = arg3;
            class427.field5828 = 0;
            class616.field8582 = arg1;
            class537 var39 = class476.method2729(class487.field6573, (byte) -46, class551.field7498);
            var39.field7295.method781(24, class235.field3379.field5288);
            var39.field7295.method791(-550441944, class657.field9100);
            var39.field7295.method790(class783.field10758, 65280);
            var39.field7295.method780(class789.field10821.method1531(83, 82) ? 1 : 0, true);
            var39.field7295.method792((byte) -61, class342.field4609);
            class173.method1314(false, var39);
        }
        if (var6 == 22) {
            class771 var40 = class527.field7150[var7];
            if (var40 != null) {
                class323.field4422++;
                class462.field6289 = arg3;
                class487.field6579 = 2;
                class616.field8582 = arg1;
                class427.field5828 = 0;
                class537 var41 = class476.method2729(class193.field2952, (byte) -46, class551.field7498);
                var41.field7295.method790(var7, 65280);
                var41.field7295.method740(class789.field10821.method1531(117, 82) ? 1 : 0, (byte) 74);
                class173.method1314(false, var41);
                class297.method1910(0, var40.method2342((byte) -19), true, var40.field5304[0], var40.method2342((byte) 96), var40.field5308[0], -2, 0, 126);
            }
        }
        if (var6 == 60) {
            class755 var42 = (class755) class664.field9216.method337((long) var7, 1);
            if (var42 != null) {
                class487.field6579 = 2;
                class666 var43 = var42.field10414;
                class427.field5828 = 0;
                class616.field8582 = arg1;
                class462.field6289 = arg3;
                class369.field4988++;
                class537 var44 = class476.method2729(class445.field6091, (byte) -46, class551.field7498);
                var44.field7295.method780(class789.field10821.method1531(85, 82) ? 1 : 0, true);
                var44.field7295.method781(26, var7);
                class173.method1314(false, var44);
                class297.method1910(0, var43.method2342((byte) -108), true, var43.field5304[0], var43.method2342((byte) 101), var43.field5308[0], -2, 0, 122);
            }
        }
        if (var6 == 17) {
            class771 var45 = class527.field7150[var7];
            if (var45 != null) {
                class427.field5828 = 0;
                class194.field2954++;
                class487.field6579 = 2;
                class462.field6289 = arg3;
                class616.field8582 = arg1;
                class537 var46 = class476.method2729(class487.field6573, (byte) -46, class551.field7498);
                var46.field7295.method781(82, var7);
                var46.field7295.method791(-550441944, class657.field9100);
                var46.field7295.method790(class783.field10758, 65280);
                var46.field7295.method780(class789.field10821.method1531(120, 82) ? 1 : 0, true);
                var46.field7295.method792((byte) -61, class342.field4609);
                class173.method1314(false, var46);
                class297.method1910(0, var45.method2342((byte) 18), true, var45.field5304[0], var45.method2342((byte) -104), var45.field5308[0], -2, 0, 118);
            }
        }
        if (var6 == 44) {
            class771 var47 = class527.field7150[var7];
            if (var47 != null) {
                class616.field8582 = arg1;
                class155.field2532++;
                class427.field5828 = 0;
                class487.field6579 = 2;
                class462.field6289 = arg3;
                class537 var48 = class476.method2729(class95.field1458, (byte) -46, class551.field7498);
                var48.field7295.method800(class789.field10821.method1531(78, 82) ? 1 : 0, 128);
                var48.field7295.method781(44, var7);
                class173.method1314(false, var48);
                class297.method1910(0, var47.method2342((byte) 100), true, var47.field5304[0], var47.method2342((byte) 102), var47.field5308[0], -2, 0, 122);
            }
        }
        int var49 = 116 % ((2 - arg2) / 47);
        if (var6 == 11) {
            class427.field5828 = 0;
            class487.field6579 = 2;
            class127.field2233++;
            class462.field6289 = arg3;
            class616.field8582 = arg1;
            class537 var50 = class476.method2729(class559.field7942, (byte) -46, class551.field7498);
            var50.field7295.method745(var5 + class400.field5510, -2);
            var50.field7295.method745(var4 + class217.field3198, -2);
            var50.field7295.method790(var7, 65280);
            var50.field7295.method800(class789.field10821.method1531(114, 82) ? 1 : 0, 128);
            class173.method1314(false, var50);
            class488.method2783(var5, var4, (byte) -37);
        }
        if (var6 == 2) {
            class17 var51 = class326.method2066(var4, var5, 86);
            if (var51 != null) {
                class713.method3967((byte) -122, var51);
            }
        }
        if (var6 == 52) {
            class755 var52 = (class755) class664.field9216.method337((long) var7, 1);
            if (var52 != null) {
                class666 var53 = var52.field10414;
                class487.field6579 = 2;
                class616.field8582 = arg1;
                class427.field5828 = 0;
                class21.field455++;
                class462.field6289 = arg3;
                class537 var54 = class476.method2729(class46.field713, (byte) -46, class551.field7498);
                var54.field7295.method745(var7, -2);
                var54.field7295.method740(class789.field10821.method1531(69, 82) ? 1 : 0, (byte) 126);
                class173.method1314(false, var54);
                class297.method1910(0, var53.method2342((byte) 109), true, var53.field5304[0], var53.method2342((byte) -49), var53.field5308[0], -2, 0, 118);
            }
        }
        if (var6 == 1007) {
            class427.field5828 = 0;
            class462.field6289 = arg3;
            class196.field2989++;
            class487.field6579 = 2;
            class616.field8582 = arg1;
            class537 var55 = class476.method2729(class501.field6858, (byte) -46, class551.field7498);
            var55.field7295.method781(15, var7);
            class173.method1314(false, var55);
        }
        if (var6 == 15) {
            class771 var56 = class527.field7150[var7];
            if (var56 != null) {
                class427.field5828 = 0;
                class462.field6289 = arg3;
                class616.field8582 = arg1;
                class487.field6579 = 2;
                class323.field4422++;
                class537 var57 = class476.method2729(class325.field4449, (byte) -46, class551.field7498);
                var57.field7295.method754(class789.field10821.method1531(73, 82) ? 1 : 0, 99);
                var57.field7295.method790(var7, 65280);
                class173.method1314(false, var57);
                class297.method1910(0, var56.method2342((byte) 105), true, var56.field5304[0], var56.method2342((byte) 98), var56.field5308[0], -2, 0, -73);
            }
        }
        if (var6 == 16) {
            if (class407.field5593 > 0 && class789.field10821.method1531(66, 82) && class789.field10821.method1531(123, 81)) {
                class85.method685(class217.field3198 + var4, (byte) 121, class235.field3379.field7391, class400.field5510 + var5);
            } else {
                class537 var58 = class209.method1469(var5, 1, var7, var4);
                if (var7 == 1) {
                    var58.field7295.method754(-1, 102);
                    var58.field7295.method754(-1, 37);
                    var58.field7295.method781(103, (int) class53.field763);
                    var58.field7295.method754(57, 27);
                    var58.field7295.method754(class408.field5599, 38);
                    var58.field7295.method754(class301.field4140, 73);
                    var58.field7295.method754(89, 112);
                    var58.field7295.method781(83, class235.field3379.field7396);
                    var58.field7295.method781(36, class235.field3379.field7398);
                    var58.field7295.method754(63, 66);
                } else {
                    class487.field6579 = 1;
                    class427.field5828 = 0;
                    class616.field8582 = arg1;
                    class462.field6289 = arg3;
                }
                class173.method1314(false, var58);
                class297.method1910(0, 1, true, var4, 1, var5, -4, 0, 0);
            }
        }
        if (var6 == 21) {
            class462.field6289 = arg3;
            class427.field5828 = 0;
            class616.field8582 = arg1;
            class562.field7967++;
            class487.field6579 = 2;
            class537 var59 = class476.method2729(class387.field5318, (byte) -46, class551.field7498);
            var59.field7295.method790(var5 + class400.field5510, 65280);
            var59.field7295.method740(class789.field10821.method1531(90, 82) ? 1 : 0, (byte) 62);
            var59.field7295.method745(Integer.MAX_VALUE & (int) (var8 >>> 32), -2);
            var59.field7295.method791(-550441944, class217.field3198 + var4);
            class173.method1314(false, var59);
            class425.method2506(var5, 114, var8, var4);
        }
        if (var6 == 10) {
            class771 var60 = class527.field7150[var7];
            if (var60 != null) {
                class487.field6579 = 2;
                class462.field6289 = arg3;
                class423.field5794++;
                class427.field5828 = 0;
                class616.field8582 = arg1;
                class537 var61 = class476.method2729(class672.field9331, (byte) -46, class551.field7498);
                var61.field7295.method790(var7, 65280);
                var61.field7295.method780(class789.field10821.method1531(73, 82) ? 1 : 0, true);
                class173.method1314(false, var61);
                class297.method1910(0, var60.method2342((byte) 14), true, var60.field5304[0], var60.method2342((byte) 124), var60.field5308[0], -2, 0, 121);
            }
        }
        if (var6 == 18) {
            class771 var62 = class527.field7150[var7];
            if (var62 != null) {
                class357.field4892++;
                class487.field6579 = 2;
                class462.field6289 = arg3;
                class616.field8582 = arg1;
                class427.field5828 = 0;
                class537 var63 = class476.method2729(class400.field5512, (byte) -46, class551.field7498);
                var63.field7295.method780(class789.field10821.method1531(69, 82) ? 1 : 0, true);
                var63.field7295.method790(var7, 65280);
                class173.method1314(false, var63);
                class297.method1910(0, var62.method2342((byte) 108), true, var62.field5304[0], var62.method2342((byte) 92), var62.field5308[0], -2, 0, -70);
            }
        }
        if (var6 == 53) {
            class427.field5828 = 0;
            class616.field8582 = arg1;
            class692.field9600++;
            class462.field6289 = arg3;
            class487.field6579 = 2;
            class537 var64 = class476.method2729(class4.field44, (byte) -46, class551.field7498);
            var64.field7295.method745(var5 + class400.field5510, -2);
            var64.field7295.method780(class789.field10821.method1531(105, 82) ? 1 : 0, true);
            var64.field7295.method781(41, class217.field3198 + var4);
            var64.field7295.method791(-550441944, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class173.method1314(false, var64);
            class425.method2506(var5, -61, var8, var4);
        }
        if (var6 == 6 && class652.field9033 == null) {
            class24.method163(var4, var5, Integer.MAX_VALUE);
            class652.field9033 = class326.method2066(var4, var5, 105);
            class410.method2433(class652.field9033, 14049);
        }
        if (var6 == 50) {
            if (class407.field5593 > 0 && class789.field10821.method1531(120, 82) && class789.field10821.method1531(102, 81)) {
                class85.method685(class217.field3198 + var4, (byte) 122, class235.field3379.field7391, class400.field5510 + var5);
            } else {
                class427.field5828 = 0;
                class640.field8810++;
                class462.field6289 = arg3;
                class616.field8582 = arg1;
                class487.field6579 = 1;
                class537 var65 = class476.method2729(class566.field8004, (byte) -46, class551.field7498);
                var65.field7295.method790(class400.field5510 + var5, 65280);
                var65.field7295.method791(-550441944, class217.field3198 + var4);
                class173.method1314(false, var65);
            }
        }
        if (var6 == 5) {
            class755 var66 = (class755) class664.field9216.method337((long) var7, 1);
            if (var66 != null) {
                class616.field8582 = arg1;
                class462.field6289 = arg3;
                class427.field5828 = 0;
                class666 var67 = var66.field10414;
                class259.field3637++;
                class487.field6579 = 2;
                class537 var68 = class476.method2729(class347.field4689, (byte) -46, class551.field7498);
                var68.field7295.method740(class789.field10821.method1531(87, 82) ? 1 : 0, (byte) 84);
                var68.field7295.method781(36, var7);
                class173.method1314(false, var68);
                class297.method1910(0, var67.method2342((byte) 115), true, var67.field5304[0], var67.method2342((byte) -17), var67.field5308[0], -2, 0, -16);
            }
        }
        if (var6 == 48) {
            class616.field8582 = arg1;
            class487.field6579 = 2;
            class462.field6289 = arg3;
            class427.field5828 = 0;
            class149.field2480++;
            class537 var69 = class476.method2729(class346.field4650, (byte) -46, class551.field7498);
            var69.field7295.method790(class400.field5510 + var5, 65280);
            var69.field7295.method740(class789.field10821.method1531(65, 82) ? 1 : 0, (byte) 89);
            var69.field7295.method791(-550441944, var4 + class217.field3198);
            var69.field7295.method790(var7, 65280);
            class173.method1314(false, var69);
            class488.method2783(var5, var4, (byte) -37);
        }
        if (var6 == 1011 || var6 == 1012 || var6 == 1003 || var6 == 1006 || var6 == 1008) {
            class153.method1202(var4, var7, -1009, var6);
        }
        if (var6 == 46) {
            class771 var70 = class527.field7150[var7];
            if (var70 != null) {
                class487.field6579 = 2;
                class462.field6289 = arg3;
                class616.field8582 = arg1;
                class427.field5828 = 0;
                class485.field6558++;
                class537 var71 = class476.method2729(class333.field4500, (byte) -46, class551.field7498);
                var71.field7295.method791(-550441944, var7);
                var71.field7295.method800(class789.field10821.method1531(125, 82) ? 1 : 0, 128);
                class173.method1314(false, var71);
                class297.method1910(0, var70.method2342((byte) 87), true, var70.field5304[0], var70.method2342((byte) -66), var70.field5308[0], -2, 0, 116);
            }
        }
        if (var6 == 45) {
            class755 var72 = (class755) class664.field9216.method337((long) var7, 1);
            if (var72 != null) {
                class666 var73 = var72.field10414;
                class662.field9179++;
                class616.field8582 = arg1;
                class487.field6579 = 2;
                class462.field6289 = arg3;
                class427.field5828 = 0;
                class537 var74 = class476.method2729(class682.field9501, (byte) -46, class551.field7498);
                var74.field7295.method754(class789.field10821.method1531(116, 82) ? 1 : 0, 84);
                var74.field7295.method745(var7, -2);
                var74.field7295.method759(class342.field4609, 121);
                var74.field7295.method781(31, class783.field10758);
                var74.field7295.method781(105, class657.field9100);
                class173.method1314(false, var74);
                class297.method1910(0, var73.method2342((byte) -53), true, var73.field5304[0], var73.method2342((byte) -107), var73.field5308[0], -2, 0, 117);
            }
        }
        if (var6 == 1002) {
            class616.field8582 = arg1;
            class487.field6579 = 2;
            class427.field5828 = 0;
            class462.field6289 = arg3;
            class442.field5990++;
            class537 var75 = class476.method2729(class633.field8765, (byte) -46, class551.field7498);
            var75.field7295.method781(109, var7);
            class173.method1314(false, var75);
        }
        if (class675.field9384) {
            class200.method1443(false);
        }
        if (class736.field10167 != null && class539.field7319 == 0) {
            class410.method2433(class736.field10167, 14049);
        }
    }
}
