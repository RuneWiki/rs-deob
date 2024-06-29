import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class152 {
   @OriginalMember(
      owner = "client!oq",
      name = "d",
      descriptor = "I"
   )
   public int field2338;
   @OriginalMember(
      owner = "client!oq",
      name = "l",
      descriptor = "S"
   )
   public short field2328;
   @OriginalMember(
      owner = "client!oq",
      name = "m",
      descriptor = "Z"
   )
   public boolean field2329;
   @OriginalMember(
      owner = "client!oq",
      name = "e",
      descriptor = "I"
   )
   public int field2331;
   @OriginalMember(
      owner = "client!oq",
      name = "i",
      descriptor = "S"
   )
   public short field2334;
   @OriginalMember(
      owner = "client!oq",
      name = "b",
      descriptor = "S"
   )
   public short field2325;
   @OriginalMember(
      owner = "client!oq",
      name = "j",
      descriptor = "I"
   )
   public int field2337;
   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "I"
   )
   public int field2332;
   @OriginalMember(
      owner = "client!oq",
      name = "k",
      descriptor = "I"
   )
   public int field2335;
   @OriginalMember(
      owner = "client!oq",
      name = "h",
      descriptor = "B"
   )
   public byte field2330;
   @OriginalMember(
      owner = "client!oq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2339 = new String[]{method1476(method1475("_\u001f@\u001fk\u0016,M\blEo")), method1476(method1475("\u0010>\u000f/7")), method1476(method1475("/.S\u0019v\u001c#DMl\u0006<U\br_,N\u0018q\u000bu\u0001")), method1476(method1475("\u0011:M\u0001")), method1476(method1475("\u0004a\u000fCb")), method1476(method1475("SoS\u0018q\u0011&O\n%_")), method1476(method1475("Qou\u0004r\u001aoU\ft\u001a!\u001bM")), method1476(method1475(":\"H\u0019k\u001a=RW?")), method1476(method1475("\u0012<")), method1476(method1475("\u0010>\u000fQv\u0011&US7")), method1476(method1475("\u0010>\u000f,7"))};
   @OriginalMember(
      owner = "client!oq",
      name = "g",
      descriptor = "I"
   )
   public static int field2327 = 0;
   @OriginalMember(
      owner = "client!oq",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field2333 = false;
   @OriginalMember(
      owner = "client!oq",
      name = "f",
      descriptor = "I"
   )
   public static int field2326;
   @OriginalMember(
      owner = "client!oq",
      name = "n",
      descriptor = "I"
   )
   public static int field2336;

   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "(JLha;I)V"
   )
   public static final void method1473(long arg0, class17 arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         class604.field8620 = 0;
         ++field2326;
         class311.field4671 = 0;
         class702.field10118 = class610.field8696;
         class610.field8696 = 0;
         long var5 = class604.method4452(88);
         if (arg2 <= -127) {
            class532 var7 = (class532)class453.field6595.method3307(16976);
            if (var4) {
               if (var7.method3974(arg1, arg0)) {
                  ++class604.field8620;
               }

               var7 = (class532)class453.field6595.method3309(true);
            }

            while(true) {
               boolean var10000;
               if (var7 == null) {
                  var10000 = class186.field2761;
                  if (!var4) {
                     if (var10000 && ~(arg0 % 100L) == -1L) {
                        System.out.println(field2339[2] + class453.field6595.method3304(0) + field2339[5] + class604.field8620);
                        System.out.println(field2339[7] + class311.field4671 + field2339[0] + class610.field8696 + field2339[6] + (class604.method4452(-127) - var5) + field2339[8]);
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = var7.method3974(arg1, arg0);
               }

               if (var10000) {
                  ++class604.field8620;
               }

               var7 = (class532)class453.field6595.method3309(true);
            }
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field2339[1] + arg0 + ',' + (arg1 != null ? field2339[4] : field2339[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "([I[II)V"
   )
   public static final void method1474(int[] param0, int[] param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!oq",
      name = "<init>",
      descriptor = "(IIIIIIIIIZZI)V"
   )
   public class152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
      try {
         this.field2338 = arg3;
         this.field2328 = (short)arg5;
         this.field2329 = arg10;
         this.field2331 = arg11;
         this.field2334 = (short)arg6;
         this.field2325 = (short)arg4;
         this.field2337 = arg2;
         this.field2332 = arg0;
         this.field2335 = arg1;
         this.field2330 = (byte)arg8;
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field2339[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1475(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1476(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 109;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
