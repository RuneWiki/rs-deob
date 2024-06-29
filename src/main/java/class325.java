import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class325 extends class180 {

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "Lcs;")
    public static class351 field4473 = new class351(15, 3);

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "[I")
    public static int[] field4478 = new int[50];

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "Ltm;")
    public static class112 field4477 = new class112("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public int field4467;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
    public int field4474;

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "Lwt;")
    public static class200 field4468;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "[I")
    public int[] field4466;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "[I")
    public int[] field4475;

    @OriginalMember(owner = "client!hh", name = "E", descriptor = "[I")
    public int[] field4479;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "[La;")
    public class420[] field4463;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "[La;")
    public class420[] field4471;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "[[[B")
    public byte[][][] field4465;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V", line = 18)
    public static final void method1953(boolean arg0) {
        field4470++;
        if (class36.field622 != null) {
            class36.field622.method1032((byte) -125);
        }
        if (class2.field22 != null) {
            class2.field22.method1032((byte) -127);
        }
        class363.method2204(22050, class255.field3578, 2, 1830961316);
        class36.field622 = class459.method2712(class138.field1965, 256, 22050, 0, class343.field4703);
        class36.field622.method1028(class39.field664, 48);
        class2.field22 = class459.method2712(class138.field1965, 256, 2048, 1, class343.field4703);
        class2.field22.method1028(class386.field5445, 48);
        if (!arg0) {
            field4473 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lbn;Z)V", line = 40)
    public static final void method1954(class106 arg0, boolean arg1) {
        field4469++;
        if (class351.field4800) {
            return;
        }
        if (!arg1) {
            method1953(true);
        }
        arg0.method1182(28818);
        class161.field2310--;
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V", line = 58)
    public static final void method1955(int arg0) {
        field4464++;
        if (class449.field6189) {
            return;
        }
        class343.field4704 = true;
        if (arg0 != 22050) {
            return;
        }
        if (class104.field1498) {
            class418.field5750 = (float) ((int) class418.field5750 - 65 & 0xFFFFFF80);
        } else {
            class244.field3452 += (-24.0F - class244.field3452) / 2.0F;
        }
        class449.field6189 = true;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V", line = 87)
    public static void method1956(byte arg0) {
        field4468 = null;
        field4477 = null;
        field4473 = null;
        if (arg0 != 67) {
            method1956((byte) -11);
        }
        field4478 = null;
    }
}
