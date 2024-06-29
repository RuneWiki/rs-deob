import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class384 extends class345 {
   @OriginalMember(
      owner = "client!vk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5683 = new String[]{method2990(method2989("mj6\fA")), method2990(method2989("mj6\bA")), method2990(method2989("mj6\rA")), method2990(method2989("mj6\u000eA")), method2990(method2989("mj6\u000fA")), method2990(method2989("mj6\nA")), method2990(method2989("mj6\u000bA"))};
   @OriginalMember(
      owner = "client!vk",
      name = "m",
      descriptor = "I"
   )
   public static int field5676;
   @OriginalMember(
      owner = "client!vk",
      name = "n",
      descriptor = "I"
   )
   public static int field5678;
   @OriginalMember(
      owner = "client!vk",
      name = "k",
      descriptor = "I"
   )
   public static int field5679;
   @OriginalMember(
      owner = "client!vk",
      name = "i",
      descriptor = "I"
   )
   public static int field5680;
   @OriginalMember(
      owner = "client!vk",
      name = "j",
      descriptor = "I"
   )
   public static int field5681;
   @OriginalMember(
      owner = "client!vk",
      name = "o",
      descriptor = "I"
   )
   public static int field5682;
   @OriginalMember(
      owner = "client!vk",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field5677;

   @OriginalMember(
      owner = "client!vk",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method54(int arg0, byte arg1) {
      try {
         ++field5681;
         if (arg1 >= 99) {
            super.field4913 = arg0;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5683[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vk",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method2986(boolean arg0) {
      try {
         if (arg0) {
            field5677 = null;
         }

         ++field5679;
         return super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5683[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vk",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method2987(int arg0) {
      try {
         if (arg0 == 800) {
            ++field5680;
            int var1 = 0;
            if (class510.field7454 != null) {
               var1 = class510.field7454.field11168.method2509(false);
            }

            if (var1 != 2) {
               if (var1 == 1) {
                  int var2 = class693.field10156 > 1024 ? 1024 : class693.field10156;
                  int var3 = class620.field9009 <= 768 ? class620.field9009 : 768;
                  class438.field6315 = (-var2 + class693.field10156) / 2;
                  class720.field10406 = var2;
                  class218.field3296 = var3;
                  class78.field1347 = 0;
               } else {
                  class720.field10406 = class693.field10156;
                  class218.field3296 = class620.field9009;
                  class78.field1347 = 0;
                  class438.field6315 = 0;
               }
            } else {
               int var4 = class693.field10156 <= 800 ? class693.field10156 : 800;
               class438.field6315 = (-var4 + class693.field10156) / 2;
               int var5 = ~class620.field9009 >= -601 ? class620.field9009 : 600;
               class720.field10406 = var4;
               class78.field1347 = 0;
               class218.field3296 = var5;
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field5683[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vk",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method2988(int arg0) {
      try {
         if (arg0 != -601) {
            method2988(-67);
         }

         field5677 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5683[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vk",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method51(int arg0) {
      try {
         ++field5678;
         if (super.field4914.method5561(0) == class294.field4103) {
            super.field4913 = 2;
         }

         if (arg0 > super.field4913 || super.field4913 > 2) {
            super.field4913 = this.method53(false);
         }

      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5683[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vk",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method53(boolean arg0) {
      try {
         if (arg0) {
            return -94;
         } else {
            ++field5676;
            return 1;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5683[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vk",
      name = "a",
      descriptor = "(BI)I"
   )
   public final int method52(byte arg0, int arg1) {
      try {
         if (arg0 > -45) {
            this.method53(false);
         }

         ++field5682;
         return 1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5683[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vk",
      name = "<init>",
      descriptor = "(Lob;)V"
   )
   public class384(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!vk",
      name = "<init>",
      descriptor = "(ILob;)V"
   )
   public class384(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!vk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2989(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2990(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
