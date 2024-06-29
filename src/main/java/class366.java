import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class366 {

    @OriginalMember(owner = "client!st", name = "h", descriptor = "Las;")
    private class132 field4979 = new class132();

    @OriginalMember(owner = "client!st", name = "a", descriptor = "Ldv;")
    public static class566 field4972 = new class566(5, -1);

    @OriginalMember(owner = "client!st", name = "l", descriptor = "Lej;")
    public static class104 field4983 = new class104("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!st", name = "n", descriptor = "Ldv;")
    public static class566 field4985 = new class566(20, -1);

    @OriginalMember(owner = "client!st", name = "p", descriptor = "I")
    public static int field4987 = 64;

    @OriginalMember(owner = "client!st", name = "o", descriptor = "Lej;")
    public static class104 field4986 = new class104("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!st", name = "e", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!st", name = "i", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!st", name = "k", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!st", name = "m", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "Las;")
    private class132 field4981;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "Lan;")
    public static class21 field4973;

    @OriginalMember(owner = "client!st", name = "q", descriptor = "Lci;")
    public static class382 field4988;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)Las;")
    public final class132 method2193(int arg0) {
        field4980++;
        class132 var2 = this.field4979.field2104;
        if (this.field4979 == var2) {
            return null;
        } else if (arg0 == -11636) {
            var2.method896(0);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V")
    public static void method2194(byte arg0) {
        int var1 = 99 / ((-arg0 - 10) / 59);
        field4986 = null;
        field4988 = null;
        field4972 = null;
        field4973 = null;
        field4985 = null;
        field4983 = null;
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(B)I")
    public final int method2195(byte arg0) {
        if (arg0 != -43) {
            method2198(null, 84);
        }
        field4974++;
        int var2 = 0;
        for (class132 var3 = this.field4979.field2104; var3 != this.field4979; var3 = var3.field2104) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IBILmc;)V")
    public static final void method2196(int arg0, byte arg1, int arg2, class114 arg3) {
        if (class493.field6904) {
            class22 var4 = class328.field4396 == -1 ? null : class533.field7455.method3115(128, class328.field4396);
            if (client.method1534(arg3).method2896(-83) && (class226.field3238 & 0x20) != 0 && (var4 == null || arg3.method815(class328.field4396, (byte) 123, var4.field323) != var4.field323)) {
                class404.method2410(class494.field6922 + " -> " + arg3.field1824, arg3.field1810, (byte) -120, arg3.field1749, 51, arg3.field1787, true, 0L, class412.field5799, class65.field1111, false);
                class3.field40++;
            }
        } else {
            for (int var5 = 9; var5 >= 5; var5--) {
                String var10 = class600.method3537(var5, 0, arg3);
                if (var10 != null) {
                    class452.field6386++;
                    class404.method2410(arg3.field1824, arg3.field1810, (byte) -120, arg3.field1749, 1009, arg3.field1787, true, (long) (var5 + 1), var10, class270.method1758((byte) -126, var5, arg3), false);
                }
            }
            String var6 = class293.method1879(arg3, 50);
            if (var6 != null) {
                class404.method2410(arg3.field1824, arg3.field1810, (byte) -120, arg3.field1749, 3, arg3.field1787, true, 0L, var6, arg3.field1750, false);
                class634.field9261++;
            }
            for (int var7 = 4; var7 >= 0; var7--) {
                String var9 = class600.method3537(var7, 0, arg3);
                if (var9 != null) {
                    class404.method2410(arg3.field1824, arg3.field1810, (byte) -120, arg3.field1749, 25, arg3.field1787, true, (long) (var7 + 1), var9, class270.method1758((byte) -89, var7, arg3), false);
                    class452.field6386++;
                }
            }
            if (client.method1534(arg3).method2898((byte) 54)) {
                class226.field3233++;
                if (arg3.field1774 == null) {
                    class404.method2410("", arg3.field1810, (byte) -120, arg3.field1749, 47, arg3.field1787, true, 0L, class215.field3073.method739(class173.field2491, -71), -1, false);
                } else {
                    class404.method2410("", arg3.field1810, (byte) -120, arg3.field1749, 47, arg3.field1787, true, 0L, arg3.field1774, -1, false);
                }
            }
        }
        int var8 = -53 / ((46 - arg1) / 45);
        field4977++;
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(I)Las;")
    public final class132 method2197(int arg0) {
        if (arg0 != 0) {
            this.method2199(125, null);
        }
        field4976++;
        class132 var2 = this.field4979.field2104;
        if (this.field4979 == var2) {
            this.field4981 = null;
            return null;
        } else {
            this.field4981 = var2.field2104;
            return var2;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method2198(String arg0, int arg1) {
        field4984++;
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        if (arg1 > -125) {
            method2194((byte) 115);
        }
        int var3 = arg0.length();
        while (var2 < var3 && class358.method2144(arg0.charAt(var2), -69)) {
            var2++;
        }
        while (var2 < var3 && class358.method2144(arg0.charAt(var3 - 1), -73)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (class157.method1012((byte) 123, var7)) {
                char var8 = class559.method3186(var7, 228);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ILas;)V")
    public final void method2199(int arg0, class132 arg1) {
        if (arg1.field2108 != null) {
            arg1.method896(0);
        }
        if (arg0 != -23751) {
            return;
        }
        field4982++;
        arg1.field2108 = this.field4979.field2108;
        arg1.field2104 = this.field4979;
        arg1.field2108.field2104 = arg1;
        arg1.field2104.field2108 = arg1;
    }

    @OriginalMember(owner = "client!st", name = "c", descriptor = "(I)Las;")
    public final class132 method2200(int arg0) {
        field4978++;
        class132 var2 = this.field4981;
        if (this.field4979 == var2) {
            this.field4981 = null;
            return null;
        }
        if (arg0 != -1) {
            field4985 = null;
        }
        this.field4981 = var2.field2104;
        return var2;
    }

    @OriginalMember(owner = "client!st", name = "d", descriptor = "(I)V")
    public final void method2201(int arg0) {
        while (true) {
            class132 var2 = this.field4979.field2104;
            if (this.field4979 == var2) {
                field4975++;
                int var3 = -123 / ((-arg0 - 43) / 50);
                this.field4981 = null;
                return;
            }
            var2.method896(0);
        }
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
    public class366() {
        this.field4979.field2108 = this.field4979;
        this.field4979.field2104 = this.field4979;
    }
}
