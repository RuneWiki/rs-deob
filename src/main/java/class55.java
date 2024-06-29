import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class55 {

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Lci;")
    public class60 field986;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lig;I)V")
    public static final void method445(class136 arg0, int arg1) {
        field983++;
        byte[] var2 = new byte[arg1];
        if (class249.field3969 != null) {
            try {
                class249.field3969.method1437(102, 0L);
                class249.field3969.method1445(2, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method965(0, var2, 24, 99);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIZ)V")
    public static final void method446(int arg0, int arg1, int arg2, boolean arg3) {
        field985++;
        if (arg1 != 18047) {
            return;
        }
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class100.field1538 = arg0;
        class23.field359 = arg2;
        class116.field1955 = arg3;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method447(int arg0, int arg1) {
        field984++;
        if (arg0 >= -36) {
            return null;
        } else if (class217.field3488[arg1].length() > 0) {
            return class47.field840[arg1] + class185.field3041 + class217.field3488[arg1];
        } else {
            return class47.field840[arg1];
        }
    }
}
