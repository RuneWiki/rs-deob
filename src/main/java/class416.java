import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class416 {

    @OriginalMember(owner = "client!br", name = "a", descriptor = "Lmq;")
    private class104 field5723 = new class104(64);

    @OriginalMember(owner = "client!br", name = "c", descriptor = "Lfc;")
    private class343 field5725;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "I")
    public int field5726;

    @OriginalMember(owner = "client!br", name = "g", descriptor = "Ltm;")
    public static class112 field5729 = new class112("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

    @OriginalMember(owner = "client!br", name = "i", descriptor = "Llm;")
    public static class84 field5731 = new class84("", 15);

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!br", name = "h", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!br", name = "j", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!br", name = "k", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(II)V", line = 6)
    public final void method2426(int arg0, int arg1) {
        class104 var3 = this.field5723;
        synchronized (this.field5723) {
            if (arg1 != -15384) {
                this.field5726 = 76;
            }
            this.field5723.method666(arg0, false);
        }
        field5728++;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V", line = 20)
    public final void method2427(byte arg0) {
        class104 var2 = this.field5723;
        synchronized (this.field5723) {
            this.field5723.method656(125);
            if (arg0 != 4) {
                this.method2431((byte) -107, -96);
            }
        }
        field5734++;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V", line = 38)
    public final void method2428(int arg0) {
        field5724++;
        if (arg0 != -12467) {
            this.method2426(-76, -45);
        }
        class104 var2 = this.field5723;
        synchronized (this.field5723) {
            this.field5723.method654(false);
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V", line = 51)
    public static void method2429(int arg0) {
        field5729 = null;
        field5731 = null;
        if (arg0 != 15) {
            method2429(-122);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIII)V", line = 63)
    public static final void method2430(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5727++;
        class366.field5214.field5830 = 0;
        class366.field5214.method2470((byte) -74, class430.field5935.field6474);
        class366.field5214.method2470((byte) -74, arg2);
        class366.field5214.method2470((byte) -74, arg0);
        class366.field5214.method2462(arg4, (byte) -123);
        class366.field5214.method2462(arg3, (byte) -123);
        class338.field4632 = -3;
        class255.field3579 = 0;
        class73.field1058 = arg1;
        class350.field4792 = 0;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(BI)Lgk;", line = 80)
    public final class11 method2431(byte arg0, int arg1) {
        field5732++;
        class104 var3 = this.field5723;
        class11 var4;
        synchronized (this.field5723) {
            var4 = (class11) this.field5723.method659((long) arg1, (byte) -1);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 > -79) {
            this.field5725 = null;
        }
        byte[] var5 = this.field5725.method2029(16, arg1, 0);
        class11 var6 = new class11();
        if (var5 != null) {
            var6.method104(new class425(var5), 71);
        }
        class104 var7 = this.field5723;
        synchronized (this.field5723) {
            this.field5723.method653(36, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Ldk;ILfc;)V", line = 114)
    public class416(class328 arg0, int arg1, class343 arg2) {
        this.field5725 = arg2;
        if (this.field5725 == null) {
            this.field5726 = 0;
        } else {
            this.field5726 = this.field5725.method2054(0, 16);
        }
    }
}
