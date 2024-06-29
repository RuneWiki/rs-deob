import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public abstract class class205 {

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "J")
    public static long field3196 = 0L;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "Lfl;")
    public static class248 field3194;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "[I")
    public static int[] field3185;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIIIJILgj;)V")
    public abstract void method225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class240 arg10);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)Lbf;")
    public class205 method1215(int arg0, int arg1, int arg2) {
        field3191++;
        return this;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILf;)Ljava/lang/String;")
    public static final String method1371(int arg0, class37 arg1) {
        if (arg0 > -16) {
            method1373(-56, -125L);
        }
        field3195++;
        return class64.method502(arg1, 32767, (byte) 115);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lja;B)V")
    public static final void method1372(class59 arg0, byte arg1) {
        class250.field3847 = 3;
        class88.method705(32, true);
        class30.field474 = 0;
        class5.field96 = 0;
        class21.field320 = true;
        class270.field4279 = 2;
        class43.field688 = true;
        class196.field3083 = true;
        class259.field3985 = 255;
        class51.field813 = true;
        class24 var2 = null;
        class155.field2366 = true;
        class56.field862 = true;
        if (arg1 <= 101) {
            method1371(-46, (class37) null);
        }
        class144.field2246 = true;
        class272.field4299 = true;
        class1.field16 = true;
        field3193++;
        class30.field486 = true;
        class39.field662 = 0;
        class8.field140 = 0;
        class242.field3760 = true;
        class253.field3896 = 127;
        class63.field1011 = 127;
        if (class64.field1024 >= 96) {
            class240.method1623(2);
        } else {
            class240.method1623(0);
        }
        class198.field3107 = false;
        class195.field3070 = false;
        class66.field1047 = false;
        class144.field2230 = 0;
        class184.field2785 = 0;
        class210.field3261 = true;
        class148.field2287 = 0;
        try {
            class248 var3 = arg0.method477(104, "runescape");
            while (var3.field3828 == 0) {
                class42.method354(1L, false);
            }
            if (var3.field3828 == 1) {
                var2 = (class24) var3.field3831;
                int var4 = 0;
                byte[] var5 = new byte[(int) var2.method194(-124)];
                while (var5.length > var4) {
                    int var6 = var2.method197(var4, var5, -1, var5.length - var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                    var4 += var6;
                }
                class136.method954((byte) 13, new class37(var5));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method199(124);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()I")
    public abstract int method223();

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IJ)V")
    public static final void method1373(int arg0, long arg1) {
        field3184++;
        if (arg0 != 1 || arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class262.field4100; var3++) {
            if (class231.field3603[var3] == arg1) {
                class262.field4100--;
                class58.field920++;
                for (int var4 = var3; var4 < class262.field4100; var4++) {
                    class3.field53[var4] = class3.field53[var4 + 1];
                    class112.field1761[var4] = class112.field1761[var4 + 1];
                    class5.field74[var4] = class5.field74[var4 + 1];
                    class231.field3603[var4] = class231.field3603[var4 + 1];
                    class174.field2587[var4] = class174.field2587[var4 + 1];
                    class29.field467[var4] = class29.field467[var4 + 1];
                }
                class65.field1027 = class141.field2178;
                class292.field4607.method1251(132, (byte) -26);
                class292.field4607.method337(2103219728, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)V")
    public static final void method1374(int arg0, int arg1, int arg2) {
        field3189++;
        if (class103.method784(-1, arg0)) {
            class197.method1317(-88, arg1, class261.field4006[arg0]);
            if (arg2 != 1) {
                method1375(33, 16);
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lbf;IIIZ)V")
    public void method1201(class205 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3190++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V")
    public abstract void method227(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)I")
    public static final int method1375(int arg0, int arg1) {
        field3188++;
        return arg0 == 127 ? arg1 >>> 8 : -77;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "()Z")
    public boolean method1228() {
        field3186++;
        return false;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static void method1376(int arg0) {
        field3185 = null;
        field3194 = null;
        if (arg0 != 1) {
            field3187 = 56;
        }
    }
}
