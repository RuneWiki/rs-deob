import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 {

    @OriginalMember(owner = "client!us", name = "l", descriptor = "I")
    public int field12 = 0;

    @OriginalMember(owner = "client!us", name = "m", descriptor = "I")
    public int field13 = 0;

    @OriginalMember(owner = "client!us", name = "g", descriptor = "Lff;")
    private class9 field7 = new class9(64);

    @OriginalMember(owner = "client!us", name = "o", descriptor = "Leg;")
    private class69 field15 = null;

    @OriginalMember(owner = "client!us", name = "n", descriptor = "Lvh;")
    private class240 field14;

    @OriginalMember(owner = "client!us", name = "e", descriptor = "Lvh;")
    private class240 field5;

    @OriginalMember(owner = "client!us", name = "d", descriptor = "[I")
    public static int[] field4 = new int[500];

    @OriginalMember(owner = "client!us", name = "j", descriptor = "[Lvq;")
    public static class320[] field10 = new class320[0];

    @OriginalMember(owner = "client!us", name = "c", descriptor = "Lfg;")
    public static class83 field3 = new class83("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!us", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!us", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!us", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!us", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!us", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!us", name = "p", descriptor = "Lvh;")
    public static class240 field16;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "Lqm;")
    public static class96 field1;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(III)Z")
    public static final boolean method1(int arg0, int arg1, int arg2) {
        if (arg1 >= -65) {
            return true;
        } else {
            field2++;
            return (arg0 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(BI)Lpm;")
    public final class412 method2(byte arg0, int arg1) {
        field9++;
        class412 var3 = (class412) this.field7.method56((long) arg1, 36);
        if (arg0 != -47) {
            field4 = null;
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field5.method1411(true, arg1, 1);
        } else {
            var4 = this.field14.method1411(true, arg1 & 0x7FFF, 1);
        }
        class412 var5 = new class412();
        var5.field6031 = this;
        if (var4 != null) {
            var5.method2454(0, new class365(var4));
        }
        if (arg1 >= 32768) {
            var5.method2451(-7799);
        }
        this.field7.method73((long) arg1, var5, 26425);
        return var5;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IB)Z")
    public static final boolean method3(int arg0, byte arg1) {
        if (arg1 < 125) {
            return true;
        } else {
            field11++;
            return arg0 != 1 && arg0 != 7;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(BJLtk;[I)Ljava/lang/String;")
    public final String method4(byte arg0, long arg1, class228 arg2, int[] arg3) {
        field6++;
        int var6 = 96 / ((arg0 + 45) / 56);
        if (this.field15 != null) {
            String var7 = this.field15.method430(arg1, arg2, -24517, arg3);
            if (var7 != null) {
                return var7;
            }
        }
        return Long.toString(arg1);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(B)V")
    public static void method5(byte arg0) {
        field10 = null;
        field3 = null;
        field16 = null;
        if (arg0 == -61) {
            field4 = null;
            field1 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(ILvh;Lvh;Leg;)V")
    public class1(int arg0, class240 arg1, class240 arg2, class69 arg3) {
        this.field14 = arg2;
        this.field5 = arg1;
        this.field15 = arg3;
        if (this.field5 != null) {
            this.field13 = this.field5.method1397((byte) 39, 1);
        }
        if (this.field14 != null) {
            this.field12 = this.field14.method1397((byte) 88, 1);
        }
    }
}
