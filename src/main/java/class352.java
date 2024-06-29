import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class352 {

    @OriginalMember(owner = "client!pba", name = "e", descriptor = "I")
    private int field5163;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!pba", name = "f", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!pba", name = "g", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IZ)V", line = 5)
    public final void method2218(int arg0, boolean arg1) {
        OpenGL.glNewList(this.field5163 + arg0, 4864);
        if (arg1) {
            this.field5163 = -45;
        }
        field5159++;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(CB)V", line = 17)
    public final void method2219(char arg0, byte arg1) {
        field5165++;
        if (arg1 != -89) {
            this.field5163 = -28;
        }
        OpenGL.glCallList(this.field5163 + arg0);
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V", line = 30)
    public final void method2220(int arg0) {
        field5164++;
        if (arg0 != 27294) {
            field5162 = 112;
        }
        OpenGL.glEndList();
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(I)V", line = 43)
    public static final void method2221(int arg0) {
        if (arg0 >= -46) {
            field5162 = -59;
        }
        class683.field9613++;
        field5160++;
        class267 var1 = class545.method3099((byte) 126, class269.field3966, class477.field6625);
        var1.field3938.method2415(false, class599.field8150);
        class617.method3392(var1, true);
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(BB)V", line = 58)
    public static final void method2222(byte arg0, byte arg1) {
        field5161++;
        if (class625.field8439 == null) {
            class625.field8439 = new byte[4][class597.field8132][class628.field8800];
        }
        int var2 = 0;
        int var3 = -23 % ((arg0 - 55) / 58);
        while (var2 < 4) {
            for (int var4 = 0; var4 < class597.field8132; var4++) {
                for (int var5 = 0; var5 < class628.field8800; var5++) {
                    class625.field8439[var2][var4][var5] = arg1;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Ldia;I)V", line = 95)
    public class352(class246 arg0, int arg1) {
        this.field5163 = OpenGL.glGenLists(arg1);
    }
}
