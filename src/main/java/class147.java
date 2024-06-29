import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public abstract class class147 {

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public volatile int field1937 = 0;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "[B")
    public byte[] field1942 = new byte[5000];

    @OriginalMember(owner = "client!p", name = "d", descriptor = "[F")
    public float[] field1940 = new float[5000];

    @OriginalMember(owner = "client!p", name = "c", descriptor = "[Ljava/lang/Object;")
    public Object[] field1939 = new Object[5000];

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public int field1941 = 0;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public volatile int field1938 = 0;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public int field1943 = 0;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lii;IIIII)V", line = 7)
    public static final void method891(class390 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field5643 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class35.field354[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class340 var13 = class124.field1608[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field5643; var14++) {
                            if (arg0.field5642[var14] == var13.field4510) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field5642[arg0.field5643++] = var13.field4510;
                        if (arg0.field5643 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field5643; var15 < 4; var15++) {
            arg0.field5642[var15] = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lno;B)V")
    public abstract void method204(class498 arg0, byte arg1);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public abstract void method197(int arg0);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BLno;)V")
    public abstract void method200(byte arg0, class498 arg1);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
    public abstract void method196(int arg0, int arg1);

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(BLno;)V")
    public abstract void method202(byte arg0, class498 arg1);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lya;FZII)V")
    public abstract void method199(class38 arg0, float arg1, boolean arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
    public abstract void method205(int arg0);

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)V")
    public abstract void method201(int arg0, int arg1);
}
