import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class106 extends class89 {

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "I")
    private int field1840;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1836 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "I")
    public static int field1842 = 0;

    @OriginalMember(owner = "client!ra", name = "bb", descriptor = "Lda;")
    private static class275 field1845 = class255.method1672(93, "Select");

    @OriginalMember(owner = "client!ra", name = "Z", descriptor = "Lda;")
    public static class275 field1843 = field1845;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "Lma;")
    public static class105 field1838;

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "Lcc;")
    public static class251 field1839;

    @OriginalMember(owner = "client!ra", name = "ab", descriptor = "[Lsh;")
    public static class205[] field1844;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "(I)V")
    public static void method787(int arg0) {
        field1839 = null;
        field1836 = null;
        field1843 = null;
        field1838 = null;
        if (arg0 == 2) {
            field1844 = null;
            field1845 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "(I)V")
    public static final void method788(int arg0) {
        class196.field3351.method522(123);
        if (arg0 != -8906) {
            method788(103);
        }
        int var1 = class196.field3351.method525((byte) -75, 1);
        ++field1834;
        if (~var1 != -1) {
            int var2 = class196.field3351.method525((byte) -50, 2);
            if (var2 == 0) {
                class181.field3117[class184.field3154++] = 2047;
            } else if (var2 == 1) {
                int var3 = class196.field3351.method525((byte) -53, 3);
                class66.field1094.method742(false, -111, var3);
                int var4 = class196.field3351.method525((byte) -128, 1);
                if (var4 == 1) {
                    class181.field3117[class184.field3154++] = 2047;
                }
            } else if (var2 == 2) {
                int var5 = class196.field3351.method525((byte) -45, 3);
                class66.field1094.method742(true, -88, var5);
                int var6 = class196.field3351.method525((byte) -41, 3);
                class66.field1094.method742(true, -101, var6);
                int var7 = class196.field3351.method525((byte) -52, 1);
                if (var7 == 1) {
                    class181.field3117[class184.field3154++] = 2047;
                }
            } else if (var2 == 3) {
                int var8 = class196.field3351.method525((byte) -84, 7);
                int var9 = class196.field3351.method525((byte) -27, 1);
                if (var9 == 1) {
                    class181.field3117[class184.field3154++] = 2047;
                }
                class159.field2790 = class196.field3351.method525((byte) -117, 2);
                int var10 = class196.field3351.method525((byte) -78, 1);
                int var11 = class196.field3351.method525((byte) -127, 7);
                class66.field1094.method810(var11, (byte) -126, var8, var10 == 1);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        int[] var3 = super.field1503.method229(arg0, (byte) -103);
        ++field1837;
        if (super.field1503.field664) {
            class154.method1090(var3, 0, class65.field1070, this.field1840);
        }
        if (arg1) {
            method788(-50);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        ++field1835;
        if (~arg2 == -1) {
            this.field1840 = (arg1.method564((byte) 106) << 12) / 255;
        }
        if (arg0 != -20503) {
            this.method49(-25, (class85) null, -85);
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(I)V")
    private class106(int arg0) {
        super(0, true);
        this.field1840 = 4096;
        this.field1840 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class106() {
        this(4096);
    }
}
