import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class192 {

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "Lge;")
    private class511 field2793 = new class511(64);

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "Lge;")
    public class511 field2800 = new class511(30);

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "Lci;")
    public class320 field2798;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "Lci;")
    private class320 field2796;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "Lea;")
    public static class390 field2799 = new class390(1);

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public static int field2801 = 0;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    public int field2803;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public final void method1307(int arg0) {
        field2794++;
        class511 var2 = this.field2793;
        synchronized (this.field2793) {
            if (arg0 != 1) {
                this.field2793 = null;
            }
            this.field2793.method2990((byte) -71);
        }
        class511 var3 = this.field2800;
        synchronized (this.field2800) {
            this.field2800.method2990((byte) -102);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IILtf;I)V")
    public static final void method1308(int arg0, int arg1, class198 arg2, int arg3) {
        field2790++;
        if (arg2 == null) {
            return;
        }
        if (arg2.field2982 != null) {
            class361 var4 = new class361();
            var4.field5256 = arg2.field2982;
            var4.field5252 = arg2;
            class281.method1805(var4);
        }
        class276.field4122 = arg2.field2990;
        class28.field391 = arg2.field2952;
        class219.field3351 = true;
        class25.field362 = arg0;
        if (arg1 != -589291614) {
            return;
        }
        class137.field2118 = arg2.field3026;
        class72.field1164 = arg2.field2969;
        class303.field4494 = arg2.field3016;
        class430.field6182 = arg3;
        class284.method1832(-17067, arg2);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIILtf;)V")
    public static final void method1309(int arg0, int arg1, int arg2, class198 arg3) {
        field2791++;
        class31 var4 = arg3.method1335(class76.field1256, (byte) 80);
        if (var4 == null) {
            return;
        }
        class76.field1256.method345(arg2, arg0, arg3.field3008 + arg2, arg0 - -arg3.field2988);
        int var5 = -36 % ((arg1 + 72) / 34);
        if (class213.field3219 >= 3) {
            class76.field1256.method322(-16777216, var4, arg2, arg0);
        } else {
            class496.field7175.method2171((float) arg3.field3008 / 2.0F + (float) arg2, (float) arg3.field2988 / 2.0F + (float) arg0, 4096, ((int) (-class508.field7354) & 0x3FFF) << 2, var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)V")
    public final void method1310(byte arg0, int arg1) {
        class511 var3 = this.field2793;
        synchronized (this.field2793) {
            this.field2793.method2989(false, arg1);
        }
        field2792++;
        class511 var4 = this.field2800;
        synchronized (this.field2800) {
            this.field2800.method2989(false, arg1);
            if (arg0 <= 115) {
                this.field2800 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIILka;Lem;I)V")
    public static final void method1311(int arg0, int arg1, int arg2, class336 arg3, class154 arg4, int arg5) {
        field2795++;
        int var6 = -83 % ((-arg1 - 5) / 37);
        if (arg3 != null) {
            arg4.method1086(arg3.method1137(), arg3.method1160(), arg3.method1164(), arg3.method1139(), arg3.method1150(), arg3.method1130(), arg2, arg3.method1147(), arg0, 56, arg5);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IB)Llq;")
    public final class394 method1312(int arg0, byte arg1) {
        field2797++;
        class511 var3 = this.field2793;
        class394 var4;
        synchronized (this.field2793) {
            var4 = (class394) this.field2793.method2982(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        } else if (arg1 == -39) {
            class320 var5 = this.field2796;
            byte[] var6;
            synchronized (this.field2796) {
                var6 = this.field2796.method2037(class337.method2143(arg0, 61), (byte) -125, class296.method1905((byte) -101, arg0));
            }
            class394 var7 = new class394();
            var7.field5620 = this;
            var7.field5612 = arg0;
            if (var6 != null) {
                var7.method2375(new class519(var6), 0);
            }
            class511 var8 = this.field2793;
            synchronized (this.field2793) {
                this.field2793.method2981(var7, 44, (long) arg0);
                return var7;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
    public static void method1313(int arg0) {
        if (arg0 == -589291614) {
            field2799 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)V")
    public final void method1314(int arg0, int arg1) {
        field2788++;
        if (arg0 != 8890) {
            this.field2793 = null;
        }
        this.field2803 = arg1;
        class511 var3 = this.field2800;
        synchronized (this.field2800) {
            this.field2800.method2990((byte) -118);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
    public final void method1315(byte arg0) {
        class511 var2 = this.field2793;
        synchronized (this.field2793) {
            this.field2793.method2980(-182819096);
        }
        if (arg0 < 19) {
            this.field2796 = null;
        }
        field2789++;
        class511 var3 = this.field2800;
        synchronized (this.field2800) {
            this.field2800.method2980(-182819096);
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lsn;ILci;Lci;)V")
    public class192(class453 arg0, int arg1, class320 arg2, class320 arg3) {
        this.field2798 = arg3;
        this.field2796 = arg2;
        int var5 = this.field2796.method2033((byte) 60) - 1;
        this.field2796.method2030(-10914, var5);
    }
}
