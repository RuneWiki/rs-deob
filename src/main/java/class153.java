import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class153 {

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field2148 = 0;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "Lla;")
    public static class262 field2153;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V", line = 15)
    public static final void method917(int arg0, int arg1) {
        field2150++;
        if (class344.method2202((byte) -65, arg1)) {
            class6.method55(arg0, 0, class224.field3054[arg1]);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V", line = 28)
    public static void method918(byte arg0) {
        field2153 = null;
        if (arg0 != -76) {
            field2152 = 14;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILen;)V", line = 44)
    public static final void method919(int arg0, class174 arg1) {
        field2154++;
        if (class410.field5931 != class19.field204 && class19.field202 != null && arg0 == -1 && class100.method536(arg1, true, class410.field5931)) {
            class19.field204 = class410.field5931;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BIII)V", line = 68)
    public static final void method920(byte arg0, int arg1, int arg2, int arg3) {
        field2155++;
        String var4 = "tele " + arg2 + "," + (arg3 >> 6) + "," + (arg1 >> 6) + "," + (arg3 & 0x3F) + "," + (arg1 & 0x3F);
        if (arg0 == -84) {
            System.out.println(var4);
            class6.method63(-11, true, var4);
        }
    }
}
