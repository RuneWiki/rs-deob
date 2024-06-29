import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class596 {
   @OriginalMember(
      owner = "client!kj",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field8303 = method4352(method4351("rN\u0002\u001f0"));
   @OriginalMember(
      owner = "client!kj",
      name = "b",
      descriptor = "I"
   )
   public static int field8300 = -1;
   @OriginalMember(
      owner = "client!kj",
      name = "a",
      descriptor = "I"
   )
   public static int field8301;
   @OriginalMember(
      owner = "client!kj",
      name = "c",
      descriptor = "I"
   )
   public static int field8302;

   @OriginalMember(
      owner = "client!kj",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method4350(byte arg0) {
      boolean var1 = client.field4273;

      try {
         ++field8302;
         class440.method3274(class338.field4832, (long)class369.field5205, true);
         if (class366.field5168 != -1) {
            class397.method3018(-125, class366.field5168);
         }

         int var2 = 0;
         if (var1) {
            if (class244.field3057[var2]) {
               class294.field3861[var2] = true;
            }

            class378.field5304[var2] = class244.field3057[var2];
            class244.field3057[var2] = false;
            ++var2;
         }

         while(true) {
            int var10000;
            if (class739.field10765 <= var2) {
               int var3 = -65 % ((-38 - arg0) / 33);
               class373.field5261 = class369.field5205;
               var10000 = class366.field5168;
               if (!var1) {
                  if (var10000 != -1) {
                     class739.field10765 = 0;
                     class483.method3513(-112);
                  }

                  class338.field4832.method593();
                  class447.method3319(class338.field4832, (byte)-16);
                  int var4 = class381.method2930((byte)-27);
                  if (~var4 == 0) {
                     var4 = class325.field4354;
                  }

                  if (var4 == -1) {
                     var4 = class696.field10167;
                  }

                  class727.method5288(88, var4);
                  class291.field3846 = 0;
                  return;
               }
            } else {
               var10000 = class244.field3057[var2];
            }

            if (var10000 != 0) {
               class294.field3861[var2] = true;
            }

            class378.field5304[var2] = class244.field3057[var2];
            class244.field3057[var2] = false;
            ++var2;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field8303 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4351(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4352(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
