import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public abstract class class431 {

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public int field6405 = 0;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public volatile int field6406 = 0;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "[Ljava/lang/Object;")
    public Object[] field6408 = new Object[5000];

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "[F")
    public float[] field6407 = new float[5000];

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public volatile int field6413 = 0;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public int field6409 = 0;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "[B")
    public byte[] field6414 = new byte[5000];

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field6404 = 1;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field6412 = 0;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "Lrn;")
    public static class174 field6410 = new class174(59, 3);

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "Lug;")
    public static class392 field6415 = new class392();

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field6416 = 0;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "Lnt;")
    public static class147 field6419;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Liq;B)V")
    public abstract void method323(class429 arg0, byte arg1);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    public abstract void method329(byte arg0);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2580(int arg0, int arg1, int arg2, int arg3) {
        if (class341.method2177(arg0, arg1, arg2)) {
            int var4 = arg1 << class426.field6345;
            int var5 = arg2 << class426.field6345;
            return class14.method91(var4 + 1, class88.field1546[arg0].method376(arg1, arg2) + arg3, var5 + 1) && class14.method91(class177.field2697 + var4 - 1, class88.field1546[arg0].method376(arg1 + 1, arg2) + arg3, var5 + 1) && class14.method91(class177.field2697 + var4 - 1, class88.field1546[arg0].method376(arg1 + 1, arg2 + 1) + arg3, class177.field2697 + var5 - 1) && class14.method91(var4 + 1, class88.field1546[arg0].method376(arg1, arg2 + 1) + arg3, class177.field2697 + var5 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(FZILna;B)V")
    public abstract void method333(float arg0, boolean arg1, int arg2, class35 arg3, byte arg4);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V")
    public abstract void method328(int arg0, int arg1);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public abstract void method327(int arg0);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static final void method2581(int arg0, int arg1, String arg2, String arg3, String arg4, byte arg5) {
        if (arg5 < 51) {
            method2580(-33, 96, -72, 30);
        }
        field6403++;
        class80.method640((byte) 94, arg2, arg1, -1, null, arg4, arg3, arg0);
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public static void method2582(int arg0) {
        field6415 = null;
        field6419 = null;
        if (arg0 == -25311) {
            field6410 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)V")
    public abstract void method331(int arg0, int arg1);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLiq;)V")
    public abstract void method322(byte arg0, class429 arg1);

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(BLiq;)V")
    public abstract void method324(byte arg0, class429 arg1);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)V")
    public static final void method2583(int arg0, byte arg1) {
        field6417 = arg0;
        field6411++;
        class488.field7226 = null;
        class289.field4118 = 1;
        class102.field1693 = 0;
        class406.field6095 = -1;
        if (arg1 != -55) {
            method2581(-104, -98, null, null, null, (byte) 39);
        }
        class281.field4024 = -1;
        class219.field3158 = false;
    }
}
