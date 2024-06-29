import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class240 implements Runnable {

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Z")
    public boolean field4176 = true;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "Ljava/lang/Object;")
    public Object field4177 = new Object();

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public int field4184 = 0;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "[I")
    public int[] field4185 = new int[500];

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "[I")
    public int[] field4186 = new int[500];

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lub;")
    private static class227 field4173 = class257.method1749("Sat", 17263);

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "[I")
    public static int[] field4170 = new int[25];

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Lub;")
    private static class227 field4171 = class257.method1749("Sun", 17263);

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Lub;")
    private static class227 field4175 = class257.method1749("Mon", 17263);

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Lub;")
    public static class227 field4172 = class257.method1749("RuneScape wird geladen )2 bitte warten)3)3)3", 17263);

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Lub;")
    private static class227 field4174 = class257.method1749("Thu", 17263);

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Lub;")
    private static class227 field4183 = class257.method1749("Tue", 17263);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Lub;")
    private static class227 field4169 = class257.method1749("Wed", 17263);

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Lub;")
    private static class227 field4180 = class257.method1749("Fri", 17263);

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "[Lub;")
    public static class227[] field4179 = new class227[] { field4171, field4175, field4183, field4169, field4174, field4180, field4173 };

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "[Lub;")
    public static class227[] field4178;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "[[[I")
    public static int[][][] field4182;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static void method1603(byte arg0) {
        field4170 = null;
        field4178 = null;
        field4180 = null;
        field4182 = null;
        field4174 = null;
        field4169 = null;
        field4179 = null;
        field4171 = null;
        field4173 = null;
        field4183 = null;
        field4175 = null;
        field4172 = null;
        int var1 = 127 % ((24 - arg0) / 56);
    }

    @OriginalMember(owner = "client!ua", name = "run", descriptor = "()V")
    public final void run() {
        field4181++;
        while (this.field4176) {
            Object var1 = this.field4177;
            synchronized (this.field4177) {
                if (this.field4184 < 500) {
                    this.field4186[this.field4184] = class100.field1752;
                    this.field4185[this.field4184] = client.field1451;
                    this.field4184++;
                }
            }
            class171.method1088(95, 50L);
        }
    }
}
