import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class class170 extends class421 {

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field2763 = 0;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public int field2764;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public int field2765;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public int field2768;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "Z")
    public boolean field2767;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IBILvs;Lza;ZI)V", line = 9)
    public final void method18(int arg0, byte arg1, int arg2, class421 arg3, class288 arg4, boolean arg5, int arg6) {
        field2760++;
        if (arg1 != 93) {
            this.method19((byte) -69);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(I)V", line = 21)
    public final void method12(int arg0) {
        field2766++;
        int var2 = 59 / ((arg0 + 35) / 44);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)I", line = 31)
    public static final int method1189(int arg0, int arg1) {
        field2762++;
        int var2 = arg0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 = arg0 + 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return var2 + arg1;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZII)V", line = 76)
    public static final void method1190(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            method1190(-57, true, 81, 11);
        }
        field2759++;
        int var4 = class186.field2990.field2560 * arg2 >> 8;
        if (arg3 == -1 && !class281.field4250) {
            class112.method931((byte) 101);
        } else if (arg3 != -1 && (class273.field4131 != arg3 || !class452.method2699((byte) 44)) && var4 != 0 && !class281.field4250) {
            class328.method2075(class202.field3263, arg3, arg0, false, -1, 0, var4);
        }
        class273.field4131 = arg3;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V", line = 101)
    public static final void method1191(int arg0) {
        class293.field4482.method2082(arg0 - 32363);
        field2761++;
        class127.field2174.method681(0);
        class428.field6404.method525(123);
        class123.field2142.method1526(true);
        class102.field1942.method843(false);
        class135.field2271.method1633(0);
        class422.field6355.method235((byte) 91);
        class514.field7469.method598((byte) 69);
        class155.field2526.method1450(123);
        class161.field2593.method1398(16);
        class452.field6708.method2454(false);
        class160.field2586.method2131((byte) 120);
        class309.field4682.method1248(true);
        class523.field7610.method1554((byte) 116);
        class453.field6727.method464(1);
        class159.field2574.method2512(29);
        class464.field6883.method2411(arg0 - 40412);
        class214.field3396.method1082((byte) 85);
        class62.field1264.method1696(arg0 - 9698);
        class60.field1255.method977(-24583);
        class361.method2217(arg0 ^ 0x7EAD);
        class334.method2106((byte) 92);
        class500.method3014((byte) -114);
        if (class9.field137 != class522.field7582) {
            for (int var1 = 0; var1 < class189.field3040.length; var1++) {
                class189.field3040[var1] = null;
            }
            class520.field7562 = 0;
        }
        class317.method2008(0);
        class357.method2201(8);
        class281.method1761(-102);
        class408.method2532(true);
        class175.method1212(-30540);
        class495.field7269.method2475((byte) 67);
        class262.field4006.method282();
        class143.field2359.method36(true);
        class258.method1664(18915);
        class312.field4716.method2742(arg0 - 32427);
        class419.field6311.method2742(arg0 ^ arg0);
        class249.field3845.method2742(0);
        class59.field1234.method2742(0);
        class237.field3657.method2742(0);
        class361.field5290.method2742(0);
        class202.field3263.method2742(0);
        class477.field7053.method2742(0);
        class455.field6758.method2742(arg0 - 32427);
        class113.field2038.method2742(arg0 - 32427);
        class151.field2493.method2742(0);
        class199.field3246.method2742(0);
        class510.field7434.method2742(0);
        class483.field7117.method2742(0);
        class219.field3448.method2742(0);
        class388.field5702.method2742(0);
        class444.field6595.method2742(0);
        class374.field5483.method2742(0);
        class324.field4929.method2742(0);
        class127.field2169.method2742(0);
        class100.field1927.method2742(0);
        class454.field6753.method2742(0);
        class230.field3570.method2742(0);
        class449.field6678.method2742(0);
        class199.field3243.method2742(arg0 ^ 0x7EAB);
        class267.field4056.method2742(0);
        class534.field7760.method2742(0);
        class192.field3103.method2742(arg0 ^ 0x7EAB);
        class58.field1222.method2742(arg0 ^ 0x7EAB);
        class41.field576.method2742(0);
        class187.field2998.method2475((byte) 67);
        class491.field7197.method2475((byte) 67);
        class130.field2208.method2475((byte) 67);
        class486.field7162.method2475((byte) 67);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)Z", line = 190)
    public final boolean method19(byte arg0) {
        if (arg0 < 121) {
            this.field2765 = 21;
        }
        field2769++;
        return false;
    }
}
