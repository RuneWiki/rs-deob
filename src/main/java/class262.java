import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class262 {

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "Lkj;")
    private class147 field4625;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "Lmf;")
    private class37 field4621;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "Ldg;")
    private class270 field4626;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field4619 = 0;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "[Lhg;")
    public static class143[] field4620 = new class143[4];

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "Lka;")
    public static class157 field4629 = new class157(16);

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "Lsg;")
    public static class30 field4636 = class167.method1221((byte) 33, "<col=ff7000>");

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "Lmc;")
    public static class151 field4635;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "Lmf;")
    public static class37 field4618;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "Laa;")
    private class8 field4634;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "[I")
    public static int[] field4637;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "[Lug;")
    private class257[] field4632;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "[[[B")
    public static byte[][][] field4630;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)Z")
    public final boolean method1808(boolean arg0) {
        field4628++;
        if (this.field4634 != null) {
            return true;
        }
        if (this.field4626 == null) {
            if (this.field4621.method365(64)) {
                return false;
            }
            this.field4626 = this.field4621.method364(255, 255, 119, (byte) 0, true);
        }
        if (this.field4626.field4506) {
            return false;
        } else {
            this.field4634 = new class8(this.field4626.method109(arg0));
            this.field4632 = new class257[(this.field4634.field124.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(Z)V")
    public final void method1809(boolean arg0) {
        if (!arg0) {
            this.method1808(true);
        }
        field4624++;
        if (this.field4632 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field4632.length; var2++) {
            if (this.field4632[var2] != null) {
                this.field4632[var2].method1789((byte) -67);
            }
        }
        for (int var3 = 0; var3 < this.field4632.length; var3++) {
            if (this.field4632[var3] != null) {
                this.field4632[var3].method1783((byte) -15);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IILvd;Lvd;)Lug;")
    public final class257 method1810(int arg0, int arg1, class110 arg2, class110 arg3) {
        if (arg0 == 8) {
            field4627++;
            return this.method1812(arg1, arg3, -121, arg2, true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lpe;Lpe;B)V")
    public static final void method1811(class81 arg0, class81 arg1, byte arg2) {
        field4631++;
        if (arg1.field1736 != null) {
            arg1.method701(true);
        }
        arg1.field1740 = arg0.field1740;
        arg1.field1736 = arg0;
        if (arg2 < 21) {
            method1811((class81) null, (class81) null, (byte) 30);
        }
        arg1.field1736.field1740 = arg1;
        arg1.field1740.field1736 = arg1;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILvd;ILvd;Z)Lug;")
    private final class257 method1812(int arg0, class110 arg1, int arg2, class110 arg3, boolean arg4) {
        field4633++;
        if (this.field4634 == null) {
            throw new RuntimeException();
        }
        this.field4634.field146 = arg0 * 8 + 5;
        if (this.field4634.field146 >= this.field4634.field124.length) {
            throw new RuntimeException();
        } else if (this.field4632[arg0] == null) {
            int var6 = this.field4634.method70(65280);
            if (arg2 > -108) {
                field4637 = null;
            }
            int var7 = this.field4634.method70(65280);
            class257 var8 = new class257(arg0, arg3, arg1, this.field4621, this.field4625, var6, var7, arg4);
            this.field4632[arg0] = var8;
            return var8;
        } else {
            return this.field4632[arg0];
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
    public static void method1813(byte arg0) {
        field4635 = null;
        int var1 = -79 / ((arg0 - 56) / 38);
        field4630 = null;
        field4637 = null;
        field4620 = null;
        field4629 = null;
        field4636 = null;
        field4618 = null;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lmf;Lkj;)V")
    public class262(class37 arg0, class147 arg1) {
        this.field4625 = arg1;
        this.field4621 = arg0;
        if (!this.field4621.method365(116)) {
            this.field4626 = this.field4621.method364(255, 255, 79, (byte) 0, true);
        }
    }
}
