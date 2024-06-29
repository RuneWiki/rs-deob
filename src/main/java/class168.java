import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class168 {
   @OriginalMember(
      owner = "client!aq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2635 = new String[]{method1522(method1521(";\bc\u001a-")), method1522(method1521(";\bc\u0019-"))};
   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field2631 = false;
   @OriginalMember(
      owner = "client!aq",
      name = "d",
      descriptor = "I"
   )
   public static int field2630;
   @OriginalMember(
      owner = "client!aq",
      name = "c",
      descriptor = "I"
   )
   public int field2633;
   @OriginalMember(
      owner = "client!aq",
      name = "b",
      descriptor = "I"
   )
   public static int field2634;
   @OriginalMember(
      owner = "client!aq",
      name = "e",
      descriptor = "Ljava/lang/String;"
   )
   public String field2632;

   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "(B)V",
      line = 5
   )
   public static final void method1519(byte arg0) {
      try {
         if (class412.field6033.field9456 && class252.field3604.field9569 != -1) {
            class552.method4114(class252.field3604.field9569, -124, class252.field3604.field9570);
         }

         if (arg0 != -52) {
            field2631 = true;
         }

         ++field2634;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2635[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "(IIIBI)V",
      line = 18
   )
   public static final void method1520(int arg0, int arg1, int arg2, byte arg3, int arg4) {
      boolean var5 = client.field4564;

      try {
         ++field2630;
         int var6 = -103 % ((20 - arg3) / 58);
         int var7 = 0;
         int var8 = arg1;
         int var9 = -arg1;
         int var10 = -1;
         int var11 = class741.method5346(arg1 + arg4, class515.field7502, class130.field2163, -1);
         int var12 = class741.method5346(arg4 - arg1, class515.field7502, class130.field2163, -1);
         class18.method132(false, var12, var11, arg2, class448.field6542[arg0]);
         if (var5 || var7 < arg1) {
            label53:
            do {
               var10 += 2;
               var9 += var10;
               int var10000 = ~var9;
               int var10001 = -1;

               int var17;
               int var18;
               do {
                  if (var10000 < var10001) {
                     --var8;
                     var9 -= var8 << 1;
                     int var13 = arg0 - var8;
                     int var14 = arg0 + var8;
                     if (var14 >= class3.field16 && class581.field8354 >= var13) {
                        int var15 = class741.method5346(arg4 + var7, class515.field7502, class130.field2163, -1);
                        int var16 = class741.method5346(-var7 + arg4, class515.field7502, class130.field2163, -1);
                        if (var14 <= class581.field8354) {
                           class18.method132(false, var16, var15, arg2, class448.field6542[var14]);
                        }

                        if (class3.field16 <= var13) {
                           class18.method132(false, var16, var15, arg2, class448.field6542[var13]);
                        }
                     }
                  }

                  ++var7;
                  var17 = arg0 - var7;
                  var18 = arg0 + var7;
                  if (var18 < class3.field16) {
                     continue label53;
                  }

                  var10000 = ~var17;
                  var10001 = ~class581.field8354;
               } while(var5);

               if (var10000 >= var10001) {
                  int var19 = class741.method5346(arg4 + var8, class515.field7502, class130.field2163, -1);
                  int var20 = class741.method5346(arg4 - var8, class515.field7502, class130.field2163, -1);
                  if (var18 <= class581.field8354) {
                     class18.method132(false, var20, var19, arg2, class448.field6542[var18]);
                  }

                  if (class3.field16 <= var17) {
                     class18.method132(false, var20, var19, arg2, class448.field6542[var17]);
                  }
               }
            } while(var7 < var8);

         }
      } catch (RuntimeException var22) {
         throw class608.method4462(var22, field2635[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1521(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1522(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
