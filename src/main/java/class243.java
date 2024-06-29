import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class243 extends class152 {

    @OriginalMember(owner = "client!hj", name = "W", descriptor = "Z")
    public static boolean field4114 = true;

    @OriginalMember(owner = "client!hj", name = "X", descriptor = "I")
    public static int field4115 = 0;

    @OriginalMember(owner = "client!hj", name = "ab", descriptor = "Lce;")
    public static class126 field4118 = class206.method1445(-7923, "Chargement de la liste des serveurs");

    @OriginalMember(owner = "client!hj", name = "db", descriptor = "[[Lnj;")
    public static class98[][] field4121 = new class98[13][13];

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!hj", name = "T", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!hj", name = "U", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!hj", name = "V", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!hj", name = "Z", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!hj", name = "bb", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!hj", name = "eb", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!hj", name = "cb", descriptor = "Lwd;")
    public static class112 field4120;

    @OriginalMember(owner = "client!hj", name = "Y", descriptor = "[[B")
    public static byte[][] field4116;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB)I", line = 5)
    public static final int method1670(int arg0, byte arg1) {
        field4109++;
        if (class59.field953 != null) {
            class59.field953.method1941((byte) -66);
            class59.field953 = null;
        }
        class103.field1651++;
        if (class103.field1651 > 4) {
            class69.field1143 = 0;
            class103.field1651 = 0;
            return arg0;
        }
        if (field4113 == class172.field3039) {
            class172.field3039 = class206.field3529;
        } else {
            class172.field3039 = field4113;
        }
        if (arg1 != 7) {
            method1674(90);
        }
        class69.field1143 = 0;
        return -1;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILbb;)V", line = 50)
    public final void method5(int arg0, int arg1, class134 arg2) {
        field4117++;
        if (arg1 == 0) {
            this.field2781 = arg2.method948(-124) == 1;
        }
        if (arg0 != 8) {
            field4118 = (class126) null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V", line = 66)
    public class243() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(II)V", line = 70)
    public static final void method1671(int arg0, int arg1) {
        field4112++;
        class173.field3067--;
        if (class173.field3067 == arg0) {
            return;
        }
        class230.method1566(class296.field4932, arg0 + 1, class296.field4932, arg0, class173.field3067 - arg0);
        class230.method1566(class214.field3636, arg0 + 1, class214.field3636, arg0, class173.field3067 - arg0);
        class230.method1568(class131.field2247, arg0 + 1, class131.field2247, arg0, class173.field3067 - arg0);
        int var2 = -57 / ((9 - arg1) / 46);
        class230.method1564(class84.field1341, arg0 + 1, class84.field1341, arg0, class173.field3067 - arg0);
        class230.method1567(class194.field3304, arg0 + 1, class194.field3304, arg0, class173.field3067 - arg0);
        class230.method1568(class34.field506, arg0 + 1, class34.field506, arg0, class173.field3067 - arg0);
        class230.method1568(class9.field115, arg0 + 1, class9.field115, arg0, class173.field3067 - arg0);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZI)[I", line = 101)
    public final int[] method6(boolean arg0, int arg1) {
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        if (!arg0) {
            return (int[]) null;
        }
        field4122++;
        if (this.field2776.field4516) {
            int[] var4 = this.method1132(arg1, -96, 0);
            for (int var5 = 0; var5 < class244.field4133; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "(I)V", line = 131)
    public static final void method1672(int arg0) {
        field4110++;
        if (!class51.field783) {
            if (class182.field3181 != 0) {
                class128.field2198 = class116.field1946;
                class322.field5496 = class177.field3120;
            } else if (class232.field3889 == 0) {
                class128.field2198 = class260.field4366;
                class322.field5496 = class138.field2493;
            } else {
                class128.field2198 = class152.field2782;
                class322.field5496 = class53.field804;
            }
            class131.field2247[0] = class202.field3465;
            class296.field4932[0] = class142.field2582;
            class214.field3636[0] = class224.field3772;
            class84.field1341[0] = 1007;
            class173.field3067 = 1;
        }
        if (class182.field3162 != -1) {
            class152.method1128(class182.field3162, -124);
        }
        for (int var1 = 0; var1 < class320.field5481; var1++) {
            if (class220.field3698[var1]) {
                class250.field4186[var1] = true;
            }
            class234.field3956[var1] = class220.field3698[var1];
            class220.field3698[var1] = false;
        }
        class249.field4164 = -1;
        class58.field898 = null;
        if (class56.field846) {
            class59.field923 = true;
        }
        class163.field2924 = class249.field4174;
        class162.field2919 = -1;
        class260.field4359 = null;
        if (class182.field3162 != -1) {
            class320.field5481 = 0;
            class264.method1773(class1.field6, class7.field87, 0, 0, 0, 0, -1, (byte) 119, class182.field3162);
        }
        if (class56.field846) {
            class101.method682();
        } else {
            class276.method1860();
        }
        class8.method45(-18564);
        if (arg0 != -3592) {
            return;
        }
        if (class51.field783) {
            if (class202.field3453) {
                class58.method397(-123);
            } else {
                class68.method493((byte) 64);
            }
        } else if (class260.field4359 != null) {
            class29.method136(class260.field4359, class161.field2910, (byte) 121, class100.field1621);
        } else if (class162.field2919 != -1) {
            class29.method136((class112) null, class249.field4164, (byte) 101, class162.field2919);
        }
        int var2 = class51.field783 ? -1 : class219.method1503(-120);
        if (var2 == -1) {
            var2 = class192.field3285;
        }
        class96.method658((byte) -122, var2);
        if (class213.field3626 == 1) {
            class213.field3626 = 2;
        }
        if (class264.field4412 == 1) {
            class264.field4412 = 2;
        }
        if (class226.field3804 == 3) {
            for (int var3 = 0; var3 < class320.field5481; var3++) {
                if (class234.field3956[var3]) {
                    if (class56.field846) {
                        class101.method695(class123.field2089[var3], class175.field3087[var3], class14.field198[var3], class36.field519[var3], 16711935, 128);
                    } else {
                        class276.method1853(class123.field2089[var3], class175.field3087[var3], class14.field198[var3], class36.field519[var3], 16711935, 128);
                    }
                } else if (class250.field4186[var3]) {
                    if (class56.field846) {
                        class101.method695(class123.field2089[var3], class175.field3087[var3], class14.field198[var3], class36.field519[var3], 16711680, 128);
                    } else {
                        class276.method1853(class123.field2089[var3], class175.field3087[var3], class14.field198[var3], class36.field519[var3], 16711680, 128);
                    }
                }
            }
        }
        class24.method119((byte) -73, class131.field2250, class303.field5038, class286.field4744.field2461, class286.field4744.field2487);
        class303.field5038 = 0;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(Z)V", line = 286)
    public static void method1673(boolean arg0) {
        field4118 = null;
        if (!arg0) {
            field4120 = null;
            field4121 = (class98[][]) null;
            field4116 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(II)[[I", line = 307)
    public final int[][] method26(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method6(true, 22);
        }
        field4111++;
        int[][] var3 = this.field2775.method319(arg0 ^ 0xFFFFFFB4, arg1);
        if (this.field2775.field775) {
            int[][] var4 = this.method1133(arg1, 0, true);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class244.field4133; var11++) {
                var7[var11] = 4096 - var5[var11];
                var9[var11] = 4096 - var6[var11];
                var10[var11] = 4096 - var8[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "(I)Loc;", line = 350)
    public static final class78 method1674(int arg0) {
        if (arg0 != 0) {
            method1674(58);
        }
        field4119++;
        try {
            return (class78) Class.forName("ul").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }
}
