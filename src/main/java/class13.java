import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class13 extends class94 {

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    private int field142 = -32768;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field140 = -1;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public int field138;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public int field141;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILwe;)V", line = 8)
    public static final void method109(int arg0, class224 arg1) {
        class88.field1322 = 3;
        class175.method1187(true, (byte) 120);
        class275.field4239 = true;
        class160.field2490 = 0;
        field139++;
        if (arg0 > -27) {
            field140 = 44;
        }
        class192.field2903 = true;
        class297.field4556 = true;
        class124.field1935 = true;
        class90.field1382 = 2;
        class10.field95 = 0;
        class187.field2843 = true;
        class233.field3752 = true;
        class10.field99 = 0;
        class318.field4986 = true;
        class274.field4219 = 127;
        class34.field441 = 127;
        class41 var2 = null;
        class226.field3605 = 0;
        class269.field4148 = true;
        class317.field4985 = true;
        class334.field5199 = 255;
        class155.field2434 = true;
        class188.field2856 = true;
        if (class109.field1676 >= 96) {
            class243.method1652(2);
        } else {
            class243.method1652(0);
        }
        class298.field4569 = false;
        class99.field1539 = 0;
        class315.field4962 = false;
        class175.field2682 = 0;
        class268.field4135 = false;
        class338.field5235 = 0;
        class104.field1609 = true;
        try {
            class252 var3 = arg1.method1509((byte) 76, "runescape");
            while (var3.field3931 == 0) {
                class96.method657(1L, (byte) -115);
            }
            if (var3.field3931 == 1) {
                var2 = (class41) var3.field3929;
                byte[] var4 = new byte[(int) var2.method297(9243)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method298(-21722, var5, var4.length - var5, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class152.method1066(-8950, new class303(var4));
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method302((byte) -34);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 100)
    public static final void method110(int arg0) {
        int var1 = 94 / ((10 - arg0) / 49);
        for (int var2 = 0; var2 < 100; var2++) {
            class2.field12[var2] = true;
        }
        field136++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIJILcj;)V", line = 113)
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class243 arg10) {
        field135++;
        class295 var13 = class160.method1106(this.field141, -97).method1894((class222) null, -1, this.field138, (byte) -96, (class172) null, 0, 0);
        if (var13 != null) {
            var13.method111(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field142 = var13.method112();
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()I", line = 129)
    public final int method112() {
        field133++;
        return this.field142;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V", line = 142)
    public final void method113(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field134++;
    }
}
