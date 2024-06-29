import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public class class93 {

    @OriginalMember(owner = "client!kia", name = "l", descriptor = "Laf;")
    private class39 field1089 = new class39(16);

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "Lae;")
    private class283 field1078;

    @OriginalMember(owner = "client!kia", name = "e", descriptor = "Lqk;")
    public static class1 field1082 = new class1(68, 4);

    @OriginalMember(owner = "client!kia", name = "g", descriptor = "Z")
    public static boolean field1084 = false;

    @OriginalMember(owner = "client!kia", name = "j", descriptor = "D")
    public static double field1087;

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!kia", name = "c", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!kia", name = "d", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!kia", name = "f", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!kia", name = "h", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!kia", name = "i", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!kia", name = "k", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!kia", name = "n", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!kia", name = "m", descriptor = "Lho;")
    public static class318 field1090;

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIIIILhka;)Leq;", line = 9)
    public final class370 method670(int arg0, int arg1, int arg2, int arg3, int arg4, class76 arg5) {
        field1081++;
        class186[] var7 = null;
        if (arg0 != 29) {
            return null;
        }
        class760 var8 = this.method671(115, arg1);
        if (var8.field10441 != null) {
            var7 = new class186[var8.field10441.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class365 var10 = arg5.method559((byte) 14, var8.field10441[var9]);
                var7[var9] = new class186(var10.field5264, var10.field5263, var10.field5254, var10.field5255, var10.field5256, var10.field5259, var10.field5258, var10.field5260);
            }
        }
        return new class370(var8.field10436, var7, var8.field10443, arg4, arg3, arg2);
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(II)Lvca;", line = 42)
    private final class760 method671(int arg0, int arg1) {
        field1080++;
        class39 var3 = this.field1089;
        class760 var4;
        synchronized (this.field1089) {
            var4 = (class760) this.field1089.method312(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class283 var5 = this.field1078;
        byte[] var6;
        synchronized (this.field1078) {
            var6 = this.field1078.method1849(arg1, (byte) 81, 29);
        }
        class760 var7 = new class760();
        if (var6 != null) {
            var7.method4200(new class511(var6), 11649);
        }
        class39 var8 = this.field1089;
        synchronized (this.field1089) {
            this.field1089.method305(var7, (long) arg1, 18320);
            if (arg0 <= 78) {
                this.method672(-65, 67);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "(II)V", line = 83)
    public final void method672(int arg0, int arg1) {
        if (arg1 != 29) {
            field1084 = true;
        }
        field1091++;
        class39 var3 = this.field1089;
        synchronized (this.field1089) {
            this.field1089.method308(-1, arg0);
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(I)V", line = 96)
    public static void method673(int arg0) {
        if (arg0 != 16) {
            field1082 = null;
        }
        field1090 = null;
        field1082 = null;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIILae;)Lao;", line = 108)
    public static final class534 method674(int arg0, int arg1, int arg2, class283 arg3) {
        field1083++;
        byte[] var4 = arg3.method1849(arg2, (byte) -13, arg0);
        if (var4 == null) {
            return null;
        } else {
            if (arg1 != 4) {
                field1087 = -0.6056274699210494D;
            }
            return new class534(var4);
        }
    }

    @OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Ljk;ILae;)V", line = 132)
    public class93(class788 arg0, int arg1, class283 arg2) {
        this.field1078 = arg2;
        this.field1078.method1867(29, (byte) 49);
    }

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "(I)V", line = 149)
    public final void method675(int arg0) {
        class39 var2 = this.field1089;
        synchronized (this.field1089) {
            this.field1089.method319(-113);
        }
        if (arg0 != 16) {
            this.field1089 = null;
        }
        field1079++;
    }

    @OriginalMember(owner = "client!kia", name = "c", descriptor = "(I)V", line = 162)
    public final void method676(int arg0) {
        int var2 = 37 / ((arg0 + 14) / 61);
        field1088++;
        class39 var3 = this.field1089;
        synchronized (this.field1089) {
            this.field1089.method314(-2);
        }
    }
}
