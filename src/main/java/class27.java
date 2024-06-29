import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class27 extends class608 implements class620 {

    @OriginalMember(owner = "client!ir", name = "B", descriptor = "Lvt;")
    private class343 field364;

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "Lpp;")
    public static class464 field362 = new class464(65, -1);

    @OriginalMember(owner = "client!ir", name = "G", descriptor = "Z")
    public static boolean field369 = true;

    @OriginalMember(owner = "client!ir", name = "E", descriptor = "Lbv;")
    public static class567 field367 = new class567("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!ir", name = "w", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!ir", name = "x", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!ir", name = "y", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!ir", name = "A", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!ir", name = "C", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!ir", name = "D", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!ir", name = "F", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)Z", line = 3)
    public final boolean method245(int arg0) {
        field365++;
        if (arg0 != -11359) {
            field367 = null;
        }
        return super.method245(arg0);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)Lvt;", line = 23)
    public final class343 method246(byte arg0) {
        if (arg0 == -91) {
            field359++;
            return this.field364;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIB)V", line = 34)
    public static final void method247(int arg0, int arg1, byte arg2) {
        field360++;
        class21 var3 = class601.method3413(arg0, 16, (byte) 111);
        if (arg2 == 95) {
            var3.method230(arg2 + 18245);
            var3.field308 = arg1;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)I", line = 52)
    public final int method248(int arg0) {
        if (arg0 != -920) {
            this.field364 = null;
        }
        field363++;
        return super.method248(-920);
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V", line = 66)
    public final void method249(int arg0) {
        super.method249(arg0);
        field368++;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(Z)V", line = 76)
    public static void method250(boolean arg0) {
        field362 = null;
        field367 = null;
        if (!arg0) {
            field367 = null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;", line = 95)
    public final Buffer method251(boolean arg0, byte arg1) {
        if (arg1 != 60) {
            this.field364 = null;
        }
        field361++;
        return super.method251(arg0, (byte) 60);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)V", line = 111)
    public final void method252(int arg0, int arg1) {
        field366++;
        super.method252(50, this.field364.field4916 * arg1);
        if (arg0 <= 29) {
            this.method246((byte) 71);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljba;IIIII)V", line = 127)
    public static final void method253(class648 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field9393 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field9399[var6] != null) {
                arg0.field9393++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field9393; var7++) {
            long var8 = class90.field1621[arg1][arg2][arg3];
            while (var8 != 0L) {
                class624 var14 = class477.field6820[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field9399[var7] == var14.field8805) {
                    continue label50;
                }
            }
            long var10 = class90.field1621[arg1][arg4][arg5];
            while (var10 != 0L) {
                class624 var13 = class477.field6820[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field9399[var7] == var13.field8805) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field9393 - 1; var12++) {
                arg0.field9399[var12] = arg0.field9399[var12 + 1];
            }
            arg0.field9393--;
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Llh;Lvt;Z)V", line = 184)
    public class27(class125 arg0, class343 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field364 = arg1;
    }
}
