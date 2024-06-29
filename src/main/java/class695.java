import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public abstract class class695 {

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "Lfc;")
    public class575 field9493;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field9491 = 1;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field9492;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field9494;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field9495;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field9496;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field9497;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field9498;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field9499;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public void method497(int arg0) {
        field9498++;
        if (arg0 != 1) {
            method3778((byte) -15);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)Z")
    public abstract boolean method494(boolean arg0);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public void method499(byte arg0) {
        field9496++;
        if (arg0 < 61) {
            this.field9493 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
    public void method490(byte arg0) {
        field9492++;
        if (arg0 != 48) {
            this.field9493 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lnm;ZI)V")
    public abstract void method488(class391 arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
    public void method500(byte arg0) {
        field9495++;
        if (arg0 != 76) {
            this.field9493 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)V")
    public static final void method3778(byte arg0) {
        field9499++;
        if (!class499.field6560) {
            return;
        }
        class477 var1 = class386.method2203(class634.field8832, 0, class34.field499);
        if (var1 != null && var1.field6338 != null) {
            class155 var2 = new class155();
            var2.field1968 = var1;
            var2.field1962 = var1.field6338;
            class709.method3885(var2);
        }
        class499.field6560 = false;
        class467.field6103 = -1;
        client.field1223 = -1;
        if (arg0 == 22 && var1 != null) {
            class386.method2199(var1, false);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V")
    public abstract void method489(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V")
    public abstract void method491(int arg0);

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lfc;)V")
    public class695(class575 arg0) {
        this.field9493 = arg0;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
    public void method496(int arg0) {
        if (arg0 <= -39) {
            field9497++;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZB)V")
    public abstract void method498(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V")
    public void method492(int arg0) {
        if (arg0 < -39) {
            field9494++;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZ)V")
    public abstract void method495(int arg0, boolean arg1);
}
