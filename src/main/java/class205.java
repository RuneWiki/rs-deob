import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class205 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/io/File;I[BI)V", line = 6)
    public static final void method1370(File arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3064++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
        try {
            var4.readFully(arg2, 0, arg3);
        } catch (EOFException var6) {
        }
        int var5 = -32 % ((41 - arg1) / 44);
        var4.close();
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIILog;Log;)V", line = 24)
    public static final void method1371(int arg0, int arg1, int arg2, class649 arg3, class649 arg4) {
        class701 var5 = class229.method1455(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field9729 = arg3;
        var5.field9739 = arg4;
        int var6 = class588.field7675 == class507.field6771 ? 1 : 0;
        if (!arg3.method806((byte) 94)) {
            arg3.field3513 = class15.field214[var6];
            class15.field214[var6] = arg3;
        } else if (arg3.method801(false)) {
            arg3.field3513 = class8.field162[var6];
            class8.field162[var6] = arg3;
        } else {
            arg3.field3513 = class496.field6694[var6];
            class496.field6694[var6] = arg3;
            class302.field4291 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method806((byte) 105)) {
            if (arg4.method801(false)) {
                arg4.field3513 = class8.field162[var6];
                class8.field162[var6] = arg4;
                return;
            }
            arg4.field3513 = class496.field6694[var6];
            class496.field6694[var6] = arg4;
            class302.field4291 = true;
            return;
        }
        arg4.field3513 = class15.field214[var6];
        class15.field214[var6] = arg4;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIILbk;)V", line = 84)
    public static final void method1372(int arg0, int arg1, int arg2, int arg3, int arg4, class379 arg5) {
        field3065++;
        class302 var6 = null;
        for (class302 var7 = (class302) class271.field3785.method21(2); var7 != null; var7 = (class302) class271.field3785.method9(-128)) {
            if (var7.field4283 == arg0 && var7.field4286 == arg1 && var7.field4289 == arg4 && var7.field4284 == arg3) {
                var6 = var7;
                break;
            }
        }
        if (var6 == null) {
            var6 = new class302();
            var6.field4286 = arg1;
            var6.field4284 = arg3;
            var6.field4283 = arg0;
            var6.field4289 = arg4;
            class271.field3785.method11(var6, -110);
        }
        var6.field4282 = arg5;
        var6.field4279 = true;
        if (arg2 == 0) {
            var6.field4288 = false;
        }
    }
}
