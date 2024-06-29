import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class88 {

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Llh;")
    private class364 field1475 = new class364(64);

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "Lhh;")
    private class84 field1479;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "Lgf;")
    public static class180 field1480 = new class180("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "Lvp;")
    public static class123 field1484 = new class123(28, 7);

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "[I")
    public static int[] field1485 = new int[3];

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V", line = 3)
    public final void method718(int arg0, int arg1) {
        if (arg1 != -5328) {
            return;
        }
        class364 var3 = this.field1475;
        synchronized (this.field1475) {
            this.field1475.method2349(0);
            this.field1475 = new class364(arg0);
        }
        field1476++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 19)
    public static void method719(int arg0) {
        field1485 = null;
        if (arg0 != -1) {
            method724(null, -111);
        }
        field1480 = null;
        field1484 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)V", line = 32)
    public final void method720(int arg0, byte arg1) {
        field1481++;
        class364 var3 = this.field1475;
        synchronized (this.field1475) {
            if (arg1 != -87) {
                this.field1479 = null;
            }
            this.field1475.method2348(arg0, -127);
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V", line = 54)
    public final void method721(int arg0) {
        class364 var2 = this.field1475;
        synchronized (this.field1475) {
            this.field1475.method2349(0);
        }
        field1483++;
        if (arg0 != 7) {
            this.method721(-56);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[B)Z", line = 67)
    public static final boolean method722(int arg0, byte[] arg1) {
        field1477++;
        class303 var2 = new class303(arg1);
        if (arg0 != -28282) {
            field1485 = null;
        }
        int var3 = var2.method1918((byte) -43);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method1918((byte) 97) == 1;
        if (var4) {
            class366.method2356(var2, (byte) -81);
        }
        class26.method212(var2, 3);
        return true;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lmt;ILhh;)V", line = 109)
    public class88(class271 arg0, int arg1, class84 arg2) {
        this.field1479 = arg2;
        if (this.field1479 != null) {
            int var4 = this.field1479.method658((byte) 101) - 1;
            this.field1479.method656((byte) 122, var4);
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V", line = 96)
    public final void method723(int arg0) {
        if (arg0 != 18870) {
            return;
        }
        class364 var2 = this.field1475;
        synchronized (this.field1475) {
            this.field1475.method2350((byte) 112);
        }
        field1482++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ldb;I)Z", line = 133)
    public static final boolean method724(class210 arg0, int arg1) {
        field1474++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field3008) {
            return false;
        } else if (!arg0.method1401(class2.field12, 77)) {
            return false;
        } else if (class460.field6787.method2485(112, (long) arg0.field3023) != null) {
            return false;
        } else if (class53.field777.method2485(62, (long) arg0.field3016) == null) {
            if (arg1 != 28) {
                method719(-24);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)Loi;", line = 165)
    public final class51 method725(int arg0, int arg1) {
        field1478++;
        class364 var3 = this.field1475;
        class51 var4;
        synchronized (this.field1475) {
            var4 = (class51) this.field1475.method2339(-61, (long) arg0);
        }
        int var5 = 125 / ((-arg1 - 20) / 49);
        if (var4 != null) {
            return var4;
        }
        byte[] var6 = this.field1479.method683(class354.method2290(true, arg0), class37.method293(arg0, 1023), 5);
        class51 var7 = new class51();
        if (var6 != null) {
            var7.method365(new class303(var6), -2742);
        }
        class364 var8 = this.field1475;
        synchronized (this.field1475) {
            this.field1475.method2342((long) arg0, var7, -96);
            return var7;
        }
    }
}
