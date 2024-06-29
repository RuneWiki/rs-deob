import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class737 extends IOException {
   @OriginalMember(
      owner = "client!pw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10754 = new String[]{method5344(method5343("-X\u000fAk")), method5344(method5343("-X\u000fCk"))};
   @OriginalMember(
      owner = "client!pw",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field10748 = new int[14];
   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "I"
   )
   public static int field10750 = 0;
   @OriginalMember(
      owner = "client!pw",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field10751 = new int[]{0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4};
   @OriginalMember(
      owner = "client!pw",
      name = "e",
      descriptor = "I"
   )
   public static int field10747;
   @OriginalMember(
      owner = "client!pw",
      name = "f",
      descriptor = "I"
   )
   public static int field10753;
   @OriginalMember(
      owner = "client!pw",
      name = "d",
      descriptor = "Lqh;"
   )
   public static class74 field10752;
   @OriginalMember(
      owner = "client!pw",
      name = "b",
      descriptor = "[[[B"
   )
   public static byte[][][] field10749;

   @OriginalMember(
      owner = "client!pw",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class737(String arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method5340(boolean arg0) {
      try {
         ++field10753;

         try {
            if (~class449.field6210 == -2) {
               int var1 = class131.field1647.method670(22486);
               if (~var1 < -1 && class131.field1647.method675((byte)-106)) {
                  int var2 = var1 - class479.field6625;
                  if (var2 < 0) {
                     var2 = 0;
                  }

                  class131.field1647.method647(-119, var2);
                  return;
               }

               label53: {
                  class131.field1647.method657(22701);
                  class131.field1647.method648(114);
                  if (class188.field2305 != null) {
                     class449.field6210 = 2;
                     if (!client.field4273) {
                        break label53;
                     }
                  }

                  class449.field6210 = 0;
               }

               class700.field10203 = null;
               class59.field619 = null;
            }

            if (class449.field6210 == 3) {
               int var3 = class131.field1647.method670(22486);
               if (~class671.field9870 < ~var3 && class131.field1647.method675((byte)101)) {
                  int var4 = class693.field10121 + var3;
                  if (~class671.field9870 > ~var4) {
                     var4 = class671.field9870;
                  }

                  class131.field1647.method647(-128, var4);
                  return;
               }

               class449.field6210 = 0;
               class693.field10121 = 0;
            }
         } catch (Exception var7) {
            var7.printStackTrace();
            class131.field1647.method657(22701);
            class700.field10203 = null;
            class449.field6210 = 0;
            class59.field619 = null;
            class188.field2305 = null;
            class728.field10669 = null;
         }

         if (!arg0) {
            field10749 = null;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field10754[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(IIILjava/lang/Class;)Lbt;"
   )
   public static final class47 method5341(int arg0, int arg1, int arg2, Class arg3) {
      class225 var4 = class111.field1404[arg0][arg1][arg2];
      if (var4 == null) {
         return null;
      } else {
         for(class752 var5 = var4.field2821; var5 != null; var5 = var5.field10923) {
            class47 var6 = var5.field10922;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field547 == arg1 && var6.field540 == arg2) {
               return var6;
            }
         }

         return null;
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5342(int arg0) {
      try {
         field10749 = null;
         field10752 = null;
         if (arg0 == -6355) {
            field10748 = null;
            field10751 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10754[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5343(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5344(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
