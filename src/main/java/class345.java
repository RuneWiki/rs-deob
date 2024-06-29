import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class345 {
   @OriginalMember(
      owner = "client!tn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5302 = new String[]{method2794(method2793("jwg>o")), method2794(method2793("\u007f,%|")), method2794(method2793("e7gQ:")), method2794(method2793("e7gR:")), method2794(method2793("e7gS:"))};
   @OriginalMember(
      owner = "client!tn",
      name = "e",
      descriptor = "I"
   )
   public static int field5296;
   @OriginalMember(
      owner = "client!tn",
      name = "b",
      descriptor = "I"
   )
   public static int field5297;
   @OriginalMember(
      owner = "client!tn",
      name = "c",
      descriptor = "I"
   )
   public static int field5301;
   @OriginalMember(
      owner = "client!tn",
      name = "f",
      descriptor = "[B"
   )
   public byte[] field5298;
   @OriginalMember(
      owner = "client!tn",
      name = "a",
      descriptor = "[S"
   )
   public short[] field5295;
   @OriginalMember(
      owner = "client!tn",
      name = "g",
      descriptor = "[S"
   )
   public short[] field5299;
   @OriginalMember(
      owner = "client!tn",
      name = "d",
      descriptor = "[S"
   )
   public short[] field5300;

   @OriginalMember(
      owner = "client!tn",
      name = "a",
      descriptor = "(Ltha;BLtha;)V",
      line = 4
   )
   public static final void method2790(class297 arg0, byte arg1, class297 arg2) {
      try {
         if (arg0.field4679 != null) {
            arg0.method2495(-24134);
         }

         ++field5301;
         arg0.field4682 = arg2.field4682;
         int var3 = 74 % ((arg1 - -13) / 32);
         arg0.field4679 = arg2;
         arg0.field4679.field4682 = arg0;
         arg0.field4682.field4679 = arg0;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5302[2] + (arg0 != null ? field5302[0] : field5302[1]) + ',' + arg1 + ',' + (arg2 != null ? field5302[0] : field5302[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tn",
      name = "a",
      descriptor = "(I)V",
      line = 21
   )
   public static final void method2791(int arg0) {
      boolean var1 = client.field1786;

      try {
         ++field5297;
         class168 var2 = (class168)class327.field4982.method4972((byte)-84);
         if (var1) {
            if (var2.field2574) {
               var2.method1564(111);
            }

            var2 = (class168)class327.field4982.method4975((byte)118);
         }

         while(true) {
            while(var2 != null) {
               if (var2.field2574) {
                  var2.method1564(111);
               }

               var2 = (class168)class327.field4982.method4975((byte)118);
            }

            class168 var3 = (class168)class497.field7567.method4972((byte)-84);
            if (!var1) {
               if (var1) {
                  if (var3.field2574) {
                     var3.method1564(arg0 + 10390);
                  }

                  var3 = (class168)class497.field7567.method4975((byte)120);
               }

               while(true) {
                  int var10000;
                  if (var3 == null) {
                     var10000 = arg0;
                     if (!var1) {
                        if (arg0 != -10279) {
                           method2790((class297)null, (byte)118, (class297)null);
                           return;
                        }

                        return;
                     }
                  } else {
                     var10000 = var3.field2574;
                  }

                  if (var10000 != 0) {
                     var3.method1564(arg0 + 10390);
                  }

                  var3 = (class168)class497.field7567.method4975((byte)120);
               }
            }

            var2 = (class168)class327.field4982.method4975((byte)118);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5302[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tn",
      name = "a",
      descriptor = "(IIIII)V",
      line = 61
   )
   public static final void method2792(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field5296;
         if (~class443.field6806 >= ~arg4 && ~arg4 >= ~class182.field2833) {
            int var7 = class47.method332(arg1, class84.field1212, 15989, class368.field5724);
            int var8 = class47.method332(arg2, class84.field1212, 15989, class368.field5724);
            class86.method834(var7, arg3, arg4, var8, (byte)94);
         }

         if (arg0 == 31372) {
            ;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field5302[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2793(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2794(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
