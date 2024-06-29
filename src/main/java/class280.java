import java.awt.Container;
import java.awt.Insets;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class280 extends class165 {

    @OriginalMember(owner = "client!co", name = "q", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4514 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!co", name = "y", descriptor = "Ljava/lang/String;")
    public static String field4522 = "Loading defaults - ";

    @OriginalMember(owner = "client!co", name = "p", descriptor = "I")
    public int field4513;

    @OriginalMember(owner = "client!co", name = "s", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!co", name = "t", descriptor = "I")
    public int field4517;

    @OriginalMember(owner = "client!co", name = "u", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!co", name = "x", descriptor = "I")
    public int field4521;

    @OriginalMember(owner = "client!co", name = "r", descriptor = "[Lt;")
    public static class339[] field4515;

    @OriginalMember(owner = "client!co", name = "v", descriptor = "[[I")
    public static int[][] field4519;

    @OriginalMember(owner = "client!co", name = "w", descriptor = "[[[B")
    public static byte[][][] field4520;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "([IIIB[J)V", line = 18)
    public static final void method2030(int[] arg0, int arg1, int arg2, byte arg3, long[] arg4) {
        if (arg1 > arg2) {
            int var5 = (arg1 + arg2) / 2;
            long var6 = arg4[var5];
            int var8 = arg2;
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var6;
            int var9 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var9;
            for (int var10 = arg2; var10 < arg1; var10++) {
                if (arg4[var10] < ((long) (var10 & 0x1) + var6)) {
                    long var11 = arg4[var10];
                    arg4[var10] = arg4[var8];
                    arg4[var8] = var11;
                    int var13 = arg0[var10];
                    arg0[var10] = arg0[var8];
                    arg0[var8++] = var13;
                }
            }
            arg4[arg1] = arg4[var8];
            arg4[var8] = var6;
            arg0[arg1] = arg0[var8];
            arg0[var8] = var9;
            method2030(arg0, var8 - 1, arg2, (byte) -47, arg4);
            method2030(arg0, arg1, var8 + 1, (byte) -126, arg4);
        }
        field4518++;
        if (arg3 >= -8) {
            method2031(44);
        }
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(I)V", line = 73)
    public static final void method2031(int arg0) {
        field4516++;
        Container var1;
        if (class204.field3362 != null) {
            var1 = class204.field3362;
        } else if (class278.field4482 == null) {
            var1 = class14.field159.field1951;
        } else {
            var1 = class278.field4482;
        }
        class55.field780 = var1.getSize().width;
        class88.field1221 = var1.getSize().height;
        if (class278.field4482 == var1) {
            Insets var2 = class278.field4482.getInsets();
            class88.field1221 -= var2.top + var2.bottom;
            class55.field780 -= var2.right + var2.left;
        }
        if (class204.method1490((byte) 59) >= 2) {
            class20.field276 = class88.field1221;
            class46.field641 = 0;
            class133.field2095 = class55.field780;
            class36.field481 = 0;
        } else {
            class36.field481 = (class55.field780 - 765) / 2;
            class20.field276 = 503;
            class133.field2095 = 765;
            class46.field641 = 0;
        }
        if (class232.field3690) {
            class232.method1666(class133.field2095, class20.field276);
        }
        class94.field1290.setSize(class133.field2095, class20.field276);
        int var3 = -90 % ((arg0 + 45) / 44);
        if (class278.field4482 == var1) {
            Insets var4 = class278.field4482.getInsets();
            class94.field1290.setLocation(class36.field481 + var4.left, class46.field641 + var4.top);
        } else {
            class94.field1290.setLocation(class36.field481, class46.field641);
        }
        if (class147.field2287 != -1) {
            class150.method1092(true, -1264641594);
        }
        class31.method174(false);
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(I)V", line = 149)
    public static void method2032(int arg0) {
        field4515 = null;
        field4520 = (byte[][][]) null;
        field4522 = null;
        if (arg0 > -1) {
            field4519 = (int[][]) ((int[][]) null);
        }
        field4514 = null;
        field4519 = (int[][]) null;
    }
}
