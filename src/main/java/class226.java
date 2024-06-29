import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class226 extends class580 {
   @OriginalMember(
      owner = "client!sba",
      name = "u",
      descriptor = "I"
   )
   private int field2900 = -1;
   @OriginalMember(
      owner = "client!sba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2906 = new String[]{method1713(method1712("]\u000eK\u001c")), method1713(method1712("HU\t^i")), method1713(method1712("@\u0019F^V\u001b")), method1713(method1712("@\u0019F^P\u001b")), method1713(method1712("@\u0019F^\\\u001b")), method1713(method1712("@\u0019F^U\u001b"))};
   @OriginalMember(
      owner = "client!sba",
      name = "x",
      descriptor = "B"
   )
   private byte field2897;
   @OriginalMember(
      owner = "client!sba",
      name = "t",
      descriptor = "I"
   )
   private int field2898;
   @OriginalMember(
      owner = "client!sba",
      name = "w",
      descriptor = "I"
   )
   public static int field2899;
   @OriginalMember(
      owner = "client!sba",
      name = "v",
      descriptor = "I"
   )
   public static int field2901;
   @OriginalMember(
      owner = "client!sba",
      name = "q",
      descriptor = "I"
   )
   public static int field2904;
   @OriginalMember(
      owner = "client!sba",
      name = "r",
      descriptor = "I"
   )
   public static int field2905;
   @OriginalMember(
      owner = "client!sba",
      name = "s",
      descriptor = "Ljava/lang/String;"
   )
   private String field2903;
   @OriginalMember(
      owner = "client!sba",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field2902;

   @OriginalMember(
      owner = "client!sba",
      name = "e",
      descriptor = "(I)V",
      line = 10
   )
   public static final void method1709(int arg0) {
      if (arg0 == 0) {
         if (class259.field3510 == 2) {
            class102.field1244[0].method1728(class688.field10367[0]);
            class102.field1244[1].method1728(class688.field10367[1]);
         } else if (class259.field3510 == 3) {
            class102.field1244[0].method1728(class688.field10367[0]);
            class102.field1244[1].method1728(class688.field10367[1]);
            class102.field1244[2].method1728(class688.field10367[2]);
         } else {
            class102.field1244[0].method1728(class688.field10367[0]);
            class102.field1244[1].method1728(class688.field10367[1]);
            class102.field1244[2].method1728(class688.field10367[2]);
            class102.field1244[3].method1728(class688.field10367[3]);
         }
      } else if (arg0 == 1) {
         if (class259.field3510 == 2) {
            class102.field1244[0].method1728(class688.field10367[2]);
         } else if (class259.field3510 == 3) {
            class102.field1244[0].method1728(class688.field10367[3]);
            class102.field1244[1].method1728(class688.field10367[4]);
         } else {
            class102.field1244[0].method1728(class688.field10367[4]);
            class102.field1244[1].method1728(class688.field10367[5]);
            class102.field1244[2].method1728(class688.field10367[6]);
         }
      } else {
         if (arg0 == 2) {
            if (class259.field3510 == 2) {
               class102.field1244[0].method1728(class688.field10367[3]);
               return;
            }

            if (class259.field3510 == 3) {
               class102.field1244[0].method1728(class688.field10367[5]);
               return;
            }

            class102.field1244[0].method1728(class688.field10367[7]);
         }

      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "a",
      descriptor = "(ILjj;)V",
      line = 87
   )
   public final void method514(int arg0, class128 arg1) {
      try {
         ++field2899;
         this.field2900 = arg1.method1038((byte)-120);
         this.field2897 = arg1.method1047((byte)-111);
         if (arg0 == 15) {
            this.field2898 = arg1.method1038((byte)-109);
            arg1.method1063(104);
            this.field2903 = arg1.method1083((byte)114);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2906[5] + arg0 + ',' + (arg1 != null ? field2906[1] : field2906[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "b",
      descriptor = "(I)V",
      line = 108
   )
   public static void method1710(int arg0) {
      try {
         field2902 = null;
         if (arg0 != -11815) {
            method1711(false, -48, -37);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2906[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "a",
      descriptor = "(Lki;B)V",
      line = 121
   )
   public final void method513(class736 arg0, byte arg1) {
      try {
         ++field2901;
         if (arg1 != 94) {
            method1710(-124);
         }

         class135 var3 = arg0.field10932[this.field2900];
         var3.field1724 = this.field2903;
         var3.field1722 = this.field2897;
         var3.field1723 = this.field2898;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2906[2] + (arg0 != null ? field2906[1] : field2906[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "a",
      descriptor = "(ZII)I",
      line = 138
   )
   public static final int method1711(boolean arg0, int arg1, int arg2) {
      int var3 = client.field4530;

      try {
         ++field2905;
         if (arg0) {
            return 0;
         } else {
            class5 var4 = class289.method2200(arg1, 0, arg0);
            if (var4 == null) {
               return class774.field11331.method3204(39713697, arg1).field11124;
            } else {
               int var5 = 0;
               int var6 = arg2;
               if (var3 != 0) {
                  if (var4.field88[arg2] == -1) {
                     ++var5;
                  }

                  var6 = arg2 + 1;
               }

               while(true) {
                  int var10000;
                  if (var6 >= var4.field88.length) {
                     var5 += class774.field11331.method3204(39713697, arg1).field11124 - var4.field88.length;
                     var10000 = var5;
                     if (var3 == 0) {
                        return var5;
                     }
                  } else {
                     var10000 = var4.field88[var6];
                  }

                  if (var10000 == -1) {
                     ++var5;
                  }

                  ++var6;
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field2906[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1712(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1713(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
