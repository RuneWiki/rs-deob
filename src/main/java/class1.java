import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class1 extends class104 {

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
    public static int field6 = 0;

    @OriginalMember(owner = "client!aj", name = "C", descriptor = "I")
    public static int field12 = 2;

    @OriginalMember(owner = "client!aj", name = "A", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "client!aj", name = "D", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!aj", name = "E", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
    public int field2;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "I")
    public int field7;

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "I")
    public int field8;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "Ljava/lang/String;")
    public String field3;

    @OriginalMember(owner = "client!aj", name = "B", descriptor = "[I")
    public int[] field11;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "[I")
    public int[] field5;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "[Llb;")
    public class224[] field1;

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "[Ljava/lang/String;")
    public String[] field9;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I[B)[B", line = 10)
    public static final byte[] method1(int arg0, byte[] arg1) {
        field13++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class86.method509(arg1, 0, var3, 0, var2);
        if (arg0 < 111) {
            method3(-41);
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V", line = 30)
    public static final void method2(int arg0, int arg1) {
        int var2 = -52 / ((arg1 - 73) / 37);
        class96 var3 = class141.method935(arg0, 11, 53);
        var3.method582(-1);
        field14++;
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)V", line = 53)
    public static final void method3(int arg0) {
        class307.field4742.method572(-111);
        field4++;
        int var1 = class307.field4742.method566(arg0, arg0 - 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class307.field4742.method566(2, 0);
        if (var2 == 0) {
            class129.field1772[class21.field278++] = 2047;
        } else if (var2 == 1) {
            int var3 = class307.field4742.method566(3, 0);
            class118.field1664.method1111((byte) 44, var3, 1);
            int var4 = class307.field4742.method566(1, 0);
            if (var4 == 1) {
                class129.field1772[class21.field278++] = 2047;
            }
        } else if (var2 == 2) {
            if (class307.field4742.method566(1, arg0 - 1) == 1) {
                int var5 = class307.field4742.method566(3, 0);
                class118.field1664.method1111((byte) 44, var5, 2);
                int var6 = class307.field4742.method566(3, 0);
                class118.field1664.method1111((byte) 44, var6, 2);
            } else {
                int var7 = class307.field4742.method566(3, 0);
                class118.field1664.method1111((byte) 44, var7, 0);
            }
            int var8 = class307.field4742.method566(1, 0);
            if (var8 == 1) {
                class129.field1772[class21.field278++] = 2047;
            }
        } else if (var2 == 3) {
            int var9 = class307.field4742.method566(7, 0);
            class138.field1940 = class307.field4742.method566(2, 0);
            int var10 = class307.field4742.method566(1, 0);
            int var11 = class307.field4742.method566(7, arg0 - 1);
            int var12 = class307.field4742.method566(1, 0);
            if (var12 == 1) {
                class129.field1772[class21.field278++] = 2047;
            }
            class118.field1664.method749(arg0 ^ 0x1, var11, var9, var10 == 1);
        }
    }
}
