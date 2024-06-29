import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public abstract class class70 extends class115 {

    @OriginalMember(owner = "client!om", name = "A", descriptor = "I")
    public int field1375;

    @OriginalMember(owner = "client!om", name = "B", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!om", name = "C", descriptor = "I")
    public int field1377;

    @OriginalMember(owner = "client!om", name = "D", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "I")
    public int field1381;

    @OriginalMember(owner = "client!om", name = "I", descriptor = "I")
    public int field1383;

    @OriginalMember(owner = "client!om", name = "J", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "I")
    public int field1385;

    @OriginalMember(owner = "client!om", name = "L", descriptor = "I")
    public int field1386;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "Z")
    public static boolean field1382;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(BLud;)Lul;", line = 11)
    public static final class43 method614(byte arg0, class279 arg1) {
        int var2 = -60 / ((arg0 - 25) / 38);
        field1380++;
        for (class43 var3 = (class43) class119.field2144.method2248(97); var3 != null; var3 = (class43) class119.field2144.method2240(1138)) {
            if (var3.field896.method1990((byte) 102, arg1)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V", line = 43)
    public static final void method615(int arg0) {
        field1379++;
        if (arg0 <= 35) {
            method616((byte) -126, false);
        }
        class166.field3005.method1338((byte) -101);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BZ)V", line = 55)
    public static final void method616(byte arg0, boolean arg1) {
        class145.field2624 = arg1;
        if (arg0 < 81) {
            field1382 = false;
        }
        class266.field4798 = !class221.method1617((byte) 29);
        field1378++;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIII)V", line = 70)
    public final void method617(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field1381 << 3;
        field1384++;
        int var7 = (arg4 << 4) + (var6 & 0xF);
        int var8 = this.field1386 << 3;
        int var9 = (arg0 << 4) + (var8 & 0xF);
        this.method589(var8, var6, var9, var7, arg3, arg2);
        if (arg1 != 16) {
            this.field1385 = 24;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IBI)Lo;", line = 94)
    public static final class204 method618(int arg0, byte arg1, int arg2) {
        field1376++;
        class204 var3 = new class204();
        if (arg1 != 14) {
            return (class204) null;
        }
        for (class43 var4 = (class43) class119.field2144.method2248(arg1 - 117); var4 != null; var4 = (class43) class119.field2144.method2240(1138)) {
            if (var4.field891 && var4.method366(125, arg2, arg0)) {
                var3.method1513(var4, 256);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIII)V")
    public abstract void method589(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIII)V")
    public abstract void method581(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V")
    public abstract void method584(int arg0, int arg1);

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(II)V")
    public abstract void method567(int arg0, int arg1);

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III)V")
    public abstract void method582(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(IIIII)V")
    public abstract void method574(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(II)V")
    public abstract void method573(int arg0, int arg1);
}
