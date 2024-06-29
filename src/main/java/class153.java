import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class153 extends class37 {

    @OriginalMember(owner = "client!wq", name = "s", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field1731;

    @OriginalMember(owner = "client!wq", name = "t", descriptor = "Ltq;")
    public static class572 field1732 = new class572(32);

    @OriginalMember(owner = "client!wq", name = "q", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!wq", name = "r", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!wq", name = "u", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(III[BIB)Z")
    public static final boolean method835(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte arg5) {
        if (arg5 != 110) {
            field1732 = null;
        }
        field1729++;
        boolean var6 = true;
        class452 var7 = new class452(arg3);
        int var8 = -1;
        label60: while (true) {
            int var9 = var7.method2522(arg5 + 3);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method2548(-29696);
                    if (var13 == 0) {
                        continue label60;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = (var10 & 0xFE7) >> 6;
                    int var16 = var7.method2541(97) >> 2;
                    int var17 = arg4 + var15;
                    int var18 = arg1 + var14;
                    if (var17 > 0 && var18 > 0 && arg2 - 1 > var17 && arg0 - 1 > var18) {
                        class335 var19 = class195.field2339.method3729(var8, (byte) 109);
                        if (var16 != 22 || class601.field8530.field2839 || var19.field4407 != 0 || var19.field4383 == 1 || var19.field4344) {
                            if (!var19.method1890(27995)) {
                                class149.field1702++;
                                var6 = false;
                            }
                            var11 = true;
                        }
                    }
                }
                int var12 = var7.method2548(-29696);
                if (var12 == 0) {
                    break;
                }
                var7.method2541(59);
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
    public final void method836(byte arg0) {
        this.field1731.method3429();
        int var2 = -58 / ((arg0 - 27) / 48);
        field1733++;
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)V")
    public static void method837(int arg0) {
        if (arg0 != 0) {
            field1732 = null;
        }
        field1732 = null;
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(I)V")
    public class153(int arg0) {
        this.field1731 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z)V")
    public static final void method838(boolean arg0) {
        field1730++;
        if (class377.field4901) {
            return;
        }
        class356.field4671 = arg0;
        class377.field4901 = true;
        if (class601.field8530.field2880) {
            class90.field1041 = ((int) class90.field1041 + 191 & 0xFFFFFF80);
        } else {
            class574.field8149 += (24.0F - class574.field8149) / 2.0F;
        }
    }
}
