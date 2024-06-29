import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class59 extends class305 {
   @OriginalMember(
      owner = "client!vg",
      name = "A",
      descriptor = "Ljava/lang/String;"
   )
   public String field1132;
   @OriginalMember(
      owner = "client!vg",
      name = "y",
      descriptor = "Lrw;"
   )
   public class788 field1134;
   @OriginalMember(
      owner = "client!vg",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1138 = new String[]{method662(method661("8SMXv")), method662(method661("8SM_v")), method662(method661("8SM^v")), method662(method661("5\u001aM5#")), method662(method661(" A\u000fw")), method662(method661("8SMZv")), method662(method661("8SMYv")), method662(method661("8SM'7 ]\u0017%v"))};
   @OriginalMember(
      owner = "client!vg",
      name = "B",
      descriptor = "Liw;"
   )
   public static class332 field1130 = new class332();
   @OriginalMember(
      owner = "client!vg",
      name = "z",
      descriptor = "I"
   )
   public static int field1131;
   @OriginalMember(
      owner = "client!vg",
      name = "x",
      descriptor = "I"
   )
   public int field1133;
   @OriginalMember(
      owner = "client!vg",
      name = "w",
      descriptor = "I"
   )
   public static int field1135;
   @OriginalMember(
      owner = "client!vg",
      name = "v",
      descriptor = "I"
   )
   public static int field1136;
   @OriginalMember(
      owner = "client!vg",
      name = "C",
      descriptor = "I"
   )
   public static int field1137;

   @OriginalMember(
      owner = "client!vg",
      name = "b",
      descriptor = "(Lvia;I)Z",
      line = 4
   )
   public final boolean method656(class587 arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field1137;
         boolean var4 = true;
         arg0.method2385(117);
         class587 var5 = (class587)this.field1134.method5680(false);
         if (var3) {
            if (class752.method5446(arg0.field8485, var5.field8485, (byte)-116)) {
               class431.method3245(var5, arg0, 3);
               ++this.field1133;
               if (var4) {
                  return false;
               }

               return true;
            }

            var5 = (class587)this.field1134.method5676(-13612);
            var4 = false;
         }

         while(true) {
            int var10000;
            int var10001;
            if (var5 == null) {
               var10000 = arg1;
               var10001 = 3;
               if (!var3) {
                  if (arg1 != 3) {
                     this.field1134 = null;
                  }

                  this.field1134.method5681(arg0, (byte)-42);
                  ++this.field1133;
                  return var4;
               }
            } else {
               var10000 = arg0.field8485;
               var10001 = var5.field8485;
            }

            if (class752.method5446(var10000, var10001, (byte)-116)) {
               class431.method3245(var5, arg0, 3);
               ++this.field1133;
               if (var4) {
                  return false;
               }

               return true;
            }

            var5 = (class587)this.field1134.method5676(-13612);
            var4 = false;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field1138[2] + (arg0 != null ? field1138[3] : field1138[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "a",
      descriptor = "(Lvia;I)Z",
      line = 35
   )
   public final boolean method657(class587 arg0, int arg1) {
      try {
         ++field1136;
         if (arg1 <= 78) {
            method659(25);
         }

         int var3 = this.method658(-26507);
         arg0.method2385(117);
         --this.field1133;
         if (this.field1133 == 0) {
            this.method154(67);
            this.method2385(117);
            --class255.field3622;
            class310.field4478.method1581(arg0.field8492, 0, this);
            return false;
         } else {
            return var3 != this.method658(-26507);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1138[5] + (arg0 != null ? field1138[3] : field1138[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "a",
      descriptor = "(I)I",
      line = 67
   )
   public final int method658(int arg0) {
      try {
         ++field1131;
         if (this.field1134.field11533.field4412 != this.field1134.field11533) {
            return ((class587)this.field1134.field11533.field4412).field8485;
         } else {
            if (arg0 != -26507) {
               method660((byte)1);
            }

            return -1;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1138[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "h",
      descriptor = "(I)I",
      line = 81
   )
   public static final int method659(int arg0) {
      try {
         ++field1135;
         if (class442.field6452) {
            return 6;
         } else if (arg0 != 5) {
            return 82;
         } else if (class450.field6572 == null) {
            return 0;
         } else {
            int var1 = class450.field6572.field8485;
            if (class133.method1267(var1, (byte)-71)) {
               return 1;
            } else if (class567.method4229(var1, 126)) {
               return 2;
            } else if (class237.method1942(1010, var1)) {
               return 3;
            } else {
               return class433.method3259(arg0 + -23, var1) ? 4 : 5;
            }
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1138[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "a",
      descriptor = "(B)V",
      line = 116
   )
   public static void method660(byte arg0) {
      try {
         if (arg0 <= -86) {
            field1130 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1138[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V",
      line = 125
   )
   public class59(String arg0) {
      try {
         this.field1132 = arg0;
         this.field1134 = new class788();
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1138[7] + (arg0 != null ? field1138[3] : field1138[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method661(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 94);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method662(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
