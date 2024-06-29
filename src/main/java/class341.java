import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class341 {

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "Lh;")
    private class571 field4595 = new class571(64);

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "I")
    public int field4598 = 0;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "Lan;")
    private class21 field4588;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
    public int field4589;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
    public static int field4590 = 0;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "Lej;")
    public static class104 field4586 = new class104("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "Lfca;")
    public static class74 field4597 = new class74("", 11);

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
    public static int field4600 = -1;

    @OriginalMember(owner = "client!ns", name = "r", descriptor = "Z")
    public static boolean field4602 = false;

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "I")
    public static int field4601 = 0;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!ns", name = "s", descriptor = "Lan;")
    public static class21 field4603;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "[Lha;")
    public static class52[] field4594;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)Lom;")
    public final class312 method2066(int arg0, int arg1) {
        field4587++;
        class571 var3 = this.field4595;
        class312 var4;
        synchronized (this.field4595) {
            var4 = (class312) this.field4595.method3252((long) arg1, (byte) 107);
        }
        if (var4 != null) {
            return var4;
        }
        class21 var5 = this.field4588;
        byte[] var6;
        synchronized (this.field4588) {
            var6 = this.field4588.method240(4, arg1, (byte) -124);
        }
        class312 var7 = new class312();
        var7.field4210 = arg1;
        var7.field4205 = this;
        if (var6 != null) {
            var7.method1949(new class11(var6), 0);
        }
        var7.method1953((byte) 121);
        class571 var8 = this.field4595;
        synchronized (this.field4595) {
            this.field4595.method3243(var7, (long) arg1, 108);
        }
        int var9 = -104 / ((arg0 - 43) / 36);
        return var7;
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(II)V")
    public final void method2067(int arg0, int arg1) {
        if (arg1 > -3) {
            this.method2070(-119);
        }
        field4596++;
        class571 var3 = this.field4595;
        synchronized (this.field4595) {
            this.field4595.method3253(arg0, -127);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
    public final void method2068(int arg0) {
        int var2 = -5 % ((48 - arg0) / 60);
        field4591++;
        class571 var3 = this.field4595;
        synchronized (this.field4595) {
            this.field4595.method3246(false);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIIZ)V")
    public static final void method2069(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (class103.field1570 == 0) {
            class380.method2248(-56, false);
        } else {
            class329.field4404 = class103.field1570;
            class452.method2658(7, 0);
        }
        field4592++;
        class559.field7748 = arg4;
        if (arg0 == 22355) {
            class378.field5075 = arg2;
            class88.field1388 = arg1;
            class413.method2455(arg3);
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
    public final void method2070(int arg0) {
        field4599++;
        class571 var2 = this.field4595;
        synchronized (this.field4595) {
            this.field4595.method3248(0);
            int var3 = 88 % ((77 - arg0) / 39);
        }
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)V")
    public static void method2071(int arg0) {
        if (arg0 != 11) {
            method2073((byte) 39);
        }
        field4603 = null;
        field4594 = null;
        field4586 = null;
        field4597 = null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lan;Lan;B)V")
    public static final void method2072(class21 arg0, class21 arg1, byte arg2) {
        class197.field2796 = arg0;
        class528.field7405 = arg1;
        if (arg2 >= -3) {
            method2071(26);
        }
        field4585++;
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lhu;ILan;)V")
    public class341(class111 arg0, int arg1, class21 arg2) {
        this.field4588 = arg2;
        this.field4589 = this.field4588.method231(4, -124);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)Ldu;")
    public static final class299 method2073(byte arg0) {
        field4593++;
        if (class413.field5819 == null || class325.field4373 == null) {
            return null;
        }
        int var1 = -21 / ((-arg0 - 55) / 53);
        for (class299 var2 = (class299) class325.field4373.method3466((byte) 53); var2 != null; var2 = (class299) class325.field4373.method3466((byte) 53)) {
            class463 var3 = class413.field5809.method2136(-114, var2.field4088);
            if (var3 != null && var3.field6516 && var3.method2709(class413.field5804, (byte) -110)) {
                return var2;
            }
        }
        return null;
    }
}
