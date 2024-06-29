import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class53 {

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "Li;")
    public static class112 field923 = new class112(32);

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field926 = 0;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field927 = 0;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "[Leh;")
    public static class101[] field930 = new class101[2048];

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "C")
    public static char field932;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field928;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BIIII)V")
    public static final void method330(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class283.method1858(arg1, arg4, arg1 + arg2, arg3 + arg4);
        class283.method1855(arg1, arg4, arg2, arg3, 0);
        field925++;
        if (class101.field1785 < 100) {
            return;
        }
        if (class177.field2923 == null || class177.field2923.field1218 != arg2 || class177.field2923.field1229 != arg3) {
            class197 var5 = new class197(arg2, arg3);
            class283.method1860(var5.field3189, arg2, arg3);
            class152.method1043(class203.field3318, 0, 0, 0, class83.field1514, 78, arg2, 0, arg3);
            class177.field2923 = var5;
            class240.field3944.method186(81);
        }
        class177.field2923.method452(arg1, arg4);
        int var6 = arg4 + (class199.field3213 * arg3 / class83.field1514);
        int var7 = class187.field3031 * arg2 / class203.field3318;
        int var8 = class227.field3821 * arg3 / class83.field1514;
        int var9 = 16711680;
        if (class185.field3002 == 1) {
            var9 = 16777215;
        }
        int var10 = arg1 + (class85.field1530 * arg2 / class203.field3318);
        class283.method1853(var10, var6, var7, var8, var9, 128);
        class283.method1846(var10, var6, var7, var8, var9);
        if (arg0 <= 8) {
            method333((byte) -46);
        }
        if (class196.field3161 <= 0) {
            return;
        }
        int var11;
        if (class168.field2787 <= 10) {
            var11 = class168.field2787 * 25;
        } else {
            var11 = (20 - class168.field2787) * 25;
        }
        for (class25 var12 = (class25) class179.field2948.method379(6347); var12 != null; var12 = (class25) class179.field2948.method378(86)) {
            if (class203.field3324 == var12.field385) {
                int var13 = var12.field389 * arg3 / class83.field1514 + arg4;
                int var14 = var12.field390 * arg2 / class203.field3318 + arg1;
                class283.method1853(var14 - 2, var13 - 2, 4, 4, 16776960, var11);
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
    public class53() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IBLvh;)Lcj;")
    public static final class74 method331(int arg0, byte arg1, class108 arg2) {
        if (arg1 == 116) {
            field922++;
            return class60.method375((byte) -39, arg0, arg2) ? class210.method1406(20533) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
    public static final void method332(byte arg0) {
        if (arg0 != 97) {
            return;
        }
        class136.field2387 = null;
        class35.field502 = null;
        class9.field118 = null;
        field924++;
        class136.field2376 = null;
        class73.field1199 = null;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)V")
    public static final void method333(byte arg0) {
        if (arg0 <= 18) {
            field927 = 75;
        }
        field933++;
        for (int var1 = 0; var1 < class206.field3430; var1++) {
            class161 var2 = class207.method1378(var1, (byte) 118);
            if (var2 != null && var2.field2682 == 0) {
                class50.field857[var1] = 0;
                class125.field2191[var1] = 0;
            }
        }
        class143.field2456 = new class112(16);
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(B)V")
    public static final void method334(byte arg0) {
        if (arg0 != -128) {
            return;
        }
        field920++;
        if (class72.field1190 != -1) {
            class63.method401(-1, class72.field1190, -1, 0);
            class72.field1190 = -1;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
    public static void method335(int arg0) {
        field930 = null;
        if (arg0 != 15810) {
            method330((byte) 5, -9, -110, 98, 27);
        }
        field923 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Leh;B[B)V")
    public final void method336(class101 arg0, byte arg1, byte[] arg2) {
        field921++;
        if (arg0.field1730[arg0.field1762] != 31 || arg0.field1730[arg0.field1762 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field928 == null) {
            this.field928 = new Inflater(true);
        }
        try {
            this.field928.setInput(arg0.field1730, arg0.field1762 + 10, -arg0.field1762 + -8 - (10 - arg0.field1730.length));
            this.field928.inflate(arg2);
        } catch (Exception var5) {
            this.field928.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field928.reset();
        int var4 = -30 / ((-arg1 - 22) / 50);
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(III)V")
    private class53(int arg0, int arg1, int arg2) {
    }
}
