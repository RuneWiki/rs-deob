import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class135 extends class60 {

    @OriginalMember(owner = "client!ud", name = "ub", descriptor = "[I")
    public static int[] field3229 = new int[2048];

    @OriginalMember(owner = "client!ud", name = "tb", descriptor = "I")
    public static int field3228 = 0;

    @OriginalMember(owner = "client!ud", name = "pb", descriptor = "I")
    public static int field3224 = -1;

    @OriginalMember(owner = "client!ud", name = "wb", descriptor = "I")
    public static int field3231 = 0;

    @OriginalMember(owner = "client!ud", name = "yb", descriptor = "I")
    public static int field3233 = 0;

    @OriginalMember(owner = "client!ud", name = "ob", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!ud", name = "qb", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!ud", name = "rb", descriptor = "I")
    public int field3226;

    @OriginalMember(owner = "client!ud", name = "sb", descriptor = "I")
    public int field3227;

    @OriginalMember(owner = "client!ud", name = "vb", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!ud", name = "xb", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ll;IBI)V")
    public static final void method1099(class76 arg0, int arg1, byte arg2, int arg3) {
        field3225++;
        if (arg0 == null) {
            return;
        }
        int var4 = class132.field3172 + class99.field2459 & 0x7FF;
        int var5 = arg1 * arg1 + arg3 * arg3;
        if (var5 > 6400) {
            return;
        }
        int var6 = class129.field3135[var4];
        int var7 = var6 * 256 / (class14.field277 + 256);
        int var8 = class129.field3131[var4];
        if (arg2 != 40) {
            return;
        }
        int var9 = var8 * 256 / (class14.field277 + 256);
        int var10 = arg1 * var9 + arg3 * var7 >> 16;
        int var11 = arg3 * var9 - arg1 * var7 >> 16;
        if (var5 > 2500) {
            arg0.method708(class119.field2917, var10 + 94 + 4 - arg0.field2083 / 2, 83 - (var11 - (-(arg0.field2082 / 2) - 4)));
        } else {
            arg0.method712(var10 + 94 + 4 - arg0.field2083 / 2, -var11 + 83 + -(arg0.field2082 / 2) - 4);
        }
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)Ldf;")
    public final class28 method448(int arg0) {
        field3223++;
        return arg0 == -16777217 ? class108.method887(-1, this.field3227).method540(this.field3226, -129) : null;
    }

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)V")
    public static void method1100(int arg0) {
        if (arg0 != -357) {
            method1099(null, 62, (byte) -94, -75);
        }
        field3229 = null;
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(B)V")
    public static final void method1101(byte arg0) {
        field3230++;
        if (class42.field1207 != 0) {
            return;
        }
        class21.field604 = 1;
        class35.field1051[0] = class74.field2075;
        class79.field2119[0] = 1001;
        if (class17.field428 != -1) {
            class115.field2814 = -1;
            class100.field2479 = -1;
            class111.method912(0, class17.field428, class66.field1878, class121.field2961, 98, 0, 503, 0, 765);
            class96.field2420 = class100.field2479;
            class2.field60 = class115.field2814;
            return;
        }
        class97.method830(104);
        boolean var1 = false;
        class100.field2479 = -1;
        class115.field2814 = -1;
        if (class121.field2961 > 4 && class66.field1878 > 4 && class121.field2961 < 516 && class66.field1878 < 338) {
            if (class121.field2977 == -1) {
                class133.method1093((byte) -83);
            } else {
                class111.method912(0, class121.field2977, class66.field1878, class121.field2961, -40, 4, 338, 4, 516);
            }
        }
        class96.field2420 = class100.field2479;
        class2.field60 = class115.field2814;
        class100.field2479 = -1;
        class115.field2814 = -1;
        if (class121.field2961 > 553 && class66.field1878 > 205 && class121.field2961 < 743 && class66.field1878 < 466) {
            if (class27.field805 != -1) {
                class111.method912(1, class27.field805, class66.field1878, class121.field2961, -108, 553, 466, 205, 743);
            } else if (class134.field3210[class101.field2518] != -1) {
                class111.method912(1, class134.field3210[class101.field2518], class66.field1878, class121.field2961, -47, 553, 466, 205, 743);
            }
        }
        if (class23.field654 != class115.field2814) {
            class13.field262 = true;
            class23.field654 = class115.field2814;
        }
        if (arg0 >= -33) {
            return;
        }
        if (class124.field2993 != class100.field2479) {
            class13.field262 = true;
            class124.field2993 = class100.field2479;
        }
        class100.field2479 = -1;
        class115.field2814 = -1;
        if (class121.field2961 > 17 && class66.field1878 > 357 && class121.field2961 < 496 && class66.field1878 < 453) {
            if (class56.field1553 != -1) {
                class111.method912(2, class56.field1553, class66.field1878, class121.field2961, 124, 17, 453, 357, 496);
            } else if (class94.field2352 != -1) {
                class111.method912(3, class94.field2352, class66.field1878, class121.field2961, 96, 17, 453, 357, 496);
            } else if (class66.field1878 < 434 && class121.field2961 < 426) {
                class140.method1127(class121.field2961 - 17, class66.field1878 + -357, 113);
            }
        }
        if ((class56.field1553 != -1 || class94.field2352 != -1) && class72.field2010 != class115.field2814) {
            class72.field2010 = class115.field2814;
            class18.field458 = true;
        }
        if ((class56.field1553 != -1 || class94.field2352 != -1) && class33.field991 != class100.field2479) {
            class33.field991 = class100.field2479;
            class18.field458 = true;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class21.field604 - 1; var2++) {
                if (class79.field2119[var2] < 1000 && class79.field2119[var2 + 1] > 1000) {
                    var1 = false;
                    class117 var3 = class35.field1051[var2];
                    class35.field1051[var2] = class35.field1051[var2 + 1];
                    class35.field1051[var2 + 1] = var3;
                    int var4 = class79.field2119[var2];
                    class79.field2119[var2] = class79.field2119[var2 + 1];
                    class79.field2119[var2 + 1] = var4;
                    int var5 = class68.field1932[var2];
                    class68.field1932[var2] = class68.field1932[var2 + 1];
                    class68.field1932[var2 + 1] = var5;
                    int var6 = class148.field3610[var2];
                    class148.field3610[var2] = class148.field3610[var2 + 1];
                    class148.field3610[var2 + 1] = var6;
                    int var7 = class94.field2360[var2];
                    class94.field2360[var2] = class94.field2360[var2 + 1];
                    class94.field2360[var2 + 1] = var7;
                }
            }
        }
    }
}
