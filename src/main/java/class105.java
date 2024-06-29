import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public abstract class class105 {

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "Lkr;")
    public static class329 field1369;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLdg;)I")
    public static final int method576(byte arg0, class20 arg1) {
        field1368++;
        if (arg0 != 100) {
            field1369 = null;
        }
        int var2 = arg1.field275;
        class362 var3 = arg1.method144((byte) 39);
        if (arg1.field398) {
            var2 = arg1.field272;
        } else if (arg1.field350 == var3.field5035 || arg1.field350 == var3.field5064 || arg1.field350 == var3.field5031 || arg1.field350 == var3.field5044) {
            var2 = arg1.field251;
        } else if (arg1.field350 == var3.field5030 || arg1.field350 == var3.field5052 || arg1.field350 == var3.field5054 || arg1.field350 == var3.field5063) {
            var2 = arg1.field288;
        }
        return var2;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static void method577(int arg0) {
        field1369 = null;
        if (arg0 != -1) {
            method578(12, true, -94);
        }
    }

    @OriginalMember(owner = "client!m", name = "k", descriptor = "(I)V")
    public abstract void method358(int arg0);

    @OriginalMember(owner = "client!m", name = "oa", descriptor = "(III)V")
    public abstract void method361(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "()Lm;")
    public abstract class105 method357();

    @OriginalMember(owner = "client!m", name = "KA", descriptor = "(I)V")
    public abstract void method366(int arg0);

    @OriginalMember(owner = "client!m", name = "ha", descriptor = "()V")
    public abstract void method354();

    @OriginalMember(owner = "client!m", name = "B", descriptor = "(IIIIII)V")
    public abstract void method360(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!m", name = "TA", descriptor = "(III)V")
    public abstract void method365(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!m", name = "ma", descriptor = "(I)V")
    public abstract void method359(int arg0);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III[I)V")
    public abstract void method363(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!m", name = "XA", descriptor = "(I)V")
    public abstract void method356(int arg0);

    @OriginalMember(owner = "client!m", name = "va", descriptor = "([I)V")
    public abstract void method364(int[] arg0);

    @OriginalMember(owner = "client!m", name = "ta", descriptor = "(I)V")
    public abstract void method355(int arg0);

    @OriginalMember(owner = "client!m", name = "EA", descriptor = "(Lm;)V")
    public abstract void method362(class105 arg0);

    @OriginalMember(owner = "client!m", name = "I", descriptor = "(III[I)V")
    public abstract void method367(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZI)Z")
    public static final boolean method578(int arg0, boolean arg1, int arg2) {
        field1367++;
        if (class179.method1104(arg0, arg2, -1)) {
            if (!arg1) {
                method576((byte) -22, null);
            }
            return (arg2 & 0xB000) != 0 | class265.method1634((byte) -128, arg2, arg0) | class430.method2513(arg2, -92, arg0) ? true : (class359.method2229(arg0, (byte) -84, arg2) | class146.method799(arg0, 10754, arg2)) & (arg0 & 0x37) == 0;
        } else {
            return false;
        }
    }
}
