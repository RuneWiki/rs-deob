import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class526 extends class577 implements class83 {
   @OriginalMember(
      owner = "client!gba",
      name = "u",
      descriptor = "I"
   )
   private int field7360;
   @OriginalMember(
      owner = "client!gba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7363 = new String[]{method3934(method3933(".=\u0001v")), method3934(method3933("'*\f4\u001ah")), method3934(method3933(";fC4%")), method3934(method3933("'*\f4\u001dh")), method3934(method3933("'*\f4\u001ch")), method3934(method3933("'*\f4d)&\u0004nfh")), method3934(method3933("'*\f4\u001eh")), method3934(method3933("'*\f4\u001bh")), method3934(method3933("'*\f4\u0019h"))};
   @OriginalMember(
      owner = "client!gba",
      name = "r",
      descriptor = "I"
   )
   public static int field7362 = -1;
   @OriginalMember(
      owner = "client!gba",
      name = "q",
      descriptor = "I"
   )
   public static int field7355;
   @OriginalMember(
      owner = "client!gba",
      name = "p",
      descriptor = "I"
   )
   public static int field7356;
   @OriginalMember(
      owner = "client!gba",
      name = "t",
      descriptor = "I"
   )
   public static int field7357;
   @OriginalMember(
      owner = "client!gba",
      name = "s",
      descriptor = "I"
   )
   public static int field7358;
   @OriginalMember(
      owner = "client!gba",
      name = "o",
      descriptor = "I"
   )
   public static int field7359;
   @OriginalMember(
      owner = "client!gba",
      name = "v",
      descriptor = "I"
   )
   public static int field7361;

   @OriginalMember(
      owner = "client!gba",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method3931(byte arg0) {
      try {
         super.field8559.method3993(this, (byte)116);
         int var2 = 83 % ((-70 - arg0) / 50);
         ++field7356;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7363[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "<init>",
      descriptor = "(Liu;I[BIZ)V"
   )
   public class526(class530 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
      super(arg0, 34962, arg2, arg3, arg4);

      try {
         this.field7360 = arg1;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field7363[5] + (arg0 != null ? field7363[2] : field7363[0]) + ',' + arg1 + ',' + (arg2 != null ? field7363[2] : field7363[0]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method801(int arg0) {
      try {
         ++field7361;
         if (arg0 != 18744) {
            this.method3931((byte)-35);
         }

         return this.field7360;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7363[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method802(int arg0) {
      try {
         ++field7355;
         int var2 = -109 / ((arg0 - -17) / 49);
         return 0L;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7363[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "a",
      descriptor = "(III[B)V"
   )
   public final void method803(int arg0, int arg1, int arg2, byte[] arg3) {
      try {
         ++field7359;
         this.method4323(arg3, arg2, (byte)-128);
         int var5 = -30 / ((-39 - arg1) / 44);
         this.field7360 = arg0;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field7363[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7363[2] : field7363[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "d",
      descriptor = "(B)V"
   )
   public static final void method3932(byte arg0) {
      try {
         ++field7357;
         class577.field8555.method428((0.1F * (float)class757.field11093.field10984.method5239(arg0 + -17959) + 0.7F) * class232.field2886);
         class577.field8555.method418(class439.field5974, class115.field1523, class172.field2230, (float)(class91.field1223 << 2), (float)(class262.field3330 << 2), (float)(class419.field5720 << 2));
         if (arg0 != -74) {
            method3932((byte)-60);
         }

         class577.field8555.method490(class58.field762);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7363[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method800(byte arg0) {
      try {
         if (arg0 >= -14) {
            field7362 = 121;
         }

         ++field7358;
         return super.field8558;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7363[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "<init>",
      descriptor = "(Liu;ILjaclib/memory/Buffer;IZ)V"
   )
   public class526(class530 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
      super(arg0, 34962, arg2, arg3, arg4);

      try {
         this.field7360 = arg1;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field7363[5] + (arg0 != null ? field7363[2] : field7363[0]) + ',' + arg1 + ',' + (arg2 != null ? field7363[2] : field7363[0]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3933(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3934(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
