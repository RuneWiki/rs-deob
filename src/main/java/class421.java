import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class421 {

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "Lak;")
    public static class234 field6270 = new class234("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!nu", name = "f", descriptor = "Ltr;")
    public static class195 field6273 = new class195(3, 7);

    @OriginalMember(owner = "client!nu", name = "i", descriptor = "I")
    public static int field6276 = 1;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!nu", name = "g", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "Lul;")
    public static class406 field6269;

    @OriginalMember(owner = "client!nu", name = "h", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field6275;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V")
    public static final void method2625(int arg0) {
        field6271++;
        int var1 = -24 / ((arg0 + 47) / 40);
        if (class429.field6373 == 6) {
            class417.method2613(false, -43);
        } else if (class364.field5382 > 0) {
            class417.method2613(class393.field5869, -66);
        } else {
            class412.field6172 = class162.field2413;
            class162.field2413 = null;
            class74.method643(12, (byte) -66);
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "([BLhp;B)V")
    public final void method2626(byte[] arg0, class217 arg1, byte arg2) {
        field6274++;
        int var4 = 50 / ((84 - arg2) / 34);
        if (arg1.field3572[arg1.field3556] != 31 || arg1.field3572[arg1.field3556 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field6275 == null) {
            this.field6275 = new Inflater(true);
        }
        try {
            this.field6275.setInput(arg1.field3572, arg1.field3556 + 10, -10 - arg1.field3556 - (8 - arg1.field3572.length));
            this.field6275.inflate(arg0);
        } catch (Exception var5) {
            this.field6275.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field6275.reset();
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V")
    public class421() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V")
    public static final void method2627(byte arg0) {
        class265.field4073 = 0;
        field6268++;
        int var1 = class238.field3819.method1532((byte) -33);
        boolean var2 = class238.field3819.method1523(3643) == 1;
        int var3 = class238.field3819.method1549(-2);
        int var4 = class238.field3819.method1512((byte) 120);
        class282.method1834(var1, 4);
        int var5 = (class142.field2164 - class238.field3819.field3556) / 16;
        class487.field7011 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class487.field7011[var6][var10] = class238.field3819.method1556(112);
            }
        }
        class301.field4569 = new byte[var5][];
        class147.field2229 = new int[var5];
        class485.field6975 = new int[var5];
        class464.field6723 = new int[var5];
        if (arg0 < 63) {
            field6276 = -104;
        }
        class60.field719 = new byte[var5][];
        class505.field7380 = new int[var5];
        class286.field4337 = null;
        class258.field3971 = new int[var5];
        class71.field1021 = null;
        class155.field2311 = new byte[var5][];
        class349.field5163 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (var4 - (class69.field976 >> 4)) / 8; var8 <= ((class69.field976 >> 4) + var4) / 8; var8++) {
            for (int var9 = (var3 - (class285.field4328 >> 4)) / 8; var9 <= (((class285.field4328 >> 4) + var3) / 8); var9++) {
                class505.field7380[var7] = (var8 << 8) + var9;
                class464.field6723[var7] = class430.field6378.method2537("m" + var8 + "_" + var9, 97);
                class485.field6975[var7] = class430.field6378.method2537("l" + var8 + "_" + var9, 69);
                class258.field3971[var7] = class430.field6378.method2537("um" + var8 + "_" + var9, 80);
                class147.field2229[var7] = class430.field6378.method2537("ul" + var8 + "_" + var9, -121);
                var7++;
            }
        }
        class366.method2290(var4, var2, var3, 10, 8);
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(B)V")
    public static void method2628(byte arg0) {
        field6269 = null;
        field6270 = null;
        if (arg0 != -77) {
            field6270 = null;
        }
        field6273 = null;
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(III)V")
    private class421(int arg0, int arg1, int arg2) {
    }
}
