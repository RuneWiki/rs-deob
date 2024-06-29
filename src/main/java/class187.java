import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class187 {

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Llb;")
    public static class132 field2574 = null;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public int field2575;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public int field2576;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public int field2580;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public int field2581;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public int field2582;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public int field2585;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public int field2586;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "[B")
    public byte[] field2577;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "[B")
    public byte[] field2578;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method1197(String arg0, byte arg1) {
        field2579++;
        if (class146.field2037 == null || arg0.length() == 0) {
            return -1;
        }
        if (arg1 != 43) {
            method1198((class235) null, (class235) null, 27);
        }
        for (int var2 = 0; var2 < class146.field2037.field2393; var2++) {
            if (class102.method673(class180.method1176(class146.field2037.field2395[var2], " ", true, "<br>"), 0, arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lhc;Lhc;I)V")
    public static final void method1198(class235 arg0, class235 arg1, int arg2) {
        field2584++;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        class153.field2127 = arg0;
        class89.field1251 = arg1;
        int var4 = (int) (Math.random() * 21.0D) - 10;
        if (arg2 != 10770) {
            method1197((String) null, (byte) 68);
        }
        class153.field2127.method1577(34, -6339);
        int var5 = (int) (Math.random() * 41.0D) - 20;
        class249.field3804 = var3 + var5;
        class6.field55 = var4 + var5;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        class105.field1459 = var5 + var6;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIILke;ILse;)V")
    public static final void method1199(int arg0, int arg1, int arg2, int arg3, class110 arg4, int arg5, class211 arg6) {
        field2583++;
        if (arg4 == null) {
            return;
        }
        int var7 = (int) class68.field912 + class217.field3266 & 0x7FF;
        int var8 = arg0 * arg0 + arg3 * arg3;
        int var9 = Math.max(arg6.field3112 / 2, arg6.field3166 / 2) + 10;
        if ((var9 * var9) < var8) {
            return;
        }
        if (arg2 != -8286) {
            method1197((String) null, (byte) -97);
        }
        int var10 = class90.field1259[var7];
        int var11 = var10 * 256 / (class111.field1600 + 256);
        int var12 = class90.field1255[var7];
        int var13 = var12 * 256 / (class111.field1600 + 256);
        int var14 = arg0 * var13 + arg3 * var11 >> 16;
        int var15 = arg3 * var13 - arg0 * var11 >> 16;
        ((class128) arg4).method868(arg6.field3112 / 2 + arg1 + var14 - (arg4.field1536 / 2), arg6.field3166 / 2 + -var15 + -(arg4.field1526 / 2) + arg5, arg6.field3182, arg6.field3106);
    }
}
