import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class801 {
   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "I"
   )
   public int field11653 = 8;
   @OriginalMember(
      owner = "client!kv",
      name = "f",
      descriptor = "I"
   )
   public int field11660 = 16777215;
   @OriginalMember(
      owner = "client!kv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11663 = new String[]{method5776(method5775("X\u0005<=Q")), method5776(method5775("]\u0006~\u0010")), method5776(method5775("H]<R\u0004")), method5776(method5775("X\u0005<?Q")), method5776(method5775("X\u0005<9Q")), method5776(method5775("X\u0005<8Q")), method5776(method5775("X\u0005<>Q"))};
   @OriginalMember(
      owner = "client!kv",
      name = "g",
      descriptor = "I"
   )
   public static int field11657 = 0;
   @OriginalMember(
      owner = "client!kv",
      name = "h",
      descriptor = "Llj;"
   )
   public static class304 field11661 = new class304(128, 4);
   @OriginalMember(
      owner = "client!kv",
      name = "q",
      descriptor = "I"
   )
   public static int field11645;
   @OriginalMember(
      owner = "client!kv",
      name = "n",
      descriptor = "I"
   )
   public int field11646;
   @OriginalMember(
      owner = "client!kv",
      name = "i",
      descriptor = "I"
   )
   public int field11647;
   @OriginalMember(
      owner = "client!kv",
      name = "e",
      descriptor = "I"
   )
   public int field11649;
   @OriginalMember(
      owner = "client!kv",
      name = "k",
      descriptor = "I"
   )
   public int field11650;
   @OriginalMember(
      owner = "client!kv",
      name = "b",
      descriptor = "I"
   )
   public int field11651;
   @OriginalMember(
      owner = "client!kv",
      name = "c",
      descriptor = "I"
   )
   public static int field11652;
   @OriginalMember(
      owner = "client!kv",
      name = "d",
      descriptor = "I"
   )
   public static int field11654;
   @OriginalMember(
      owner = "client!kv",
      name = "j",
      descriptor = "I"
   )
   public int field11655;
   @OriginalMember(
      owner = "client!kv",
      name = "l",
      descriptor = "I"
   )
   public static int field11656;
   @OriginalMember(
      owner = "client!kv",
      name = "r",
      descriptor = "I"
   )
   public int field11658;
   @OriginalMember(
      owner = "client!kv",
      name = "p",
      descriptor = "I"
   )
   public int field11659;
   @OriginalMember(
      owner = "client!kv",
      name = "m",
      descriptor = "I"
   )
   public static int field11662;
   @OriginalMember(
      owner = "client!kv",
      name = "o",
      descriptor = "Z"
   )
   public boolean field11648;

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(ILica;)V",
      line = 6
   )
   public final void method5770(int arg0, class354 arg1) {
      boolean var3 = client.field1786;

      try {
         while(true) {
            int var4 = arg1.method2855(-31007);
            if (~var4 != -1) {
               this.method5774(14381, var4, arg1);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg0 != -1) {
               method5772((byte)-97);
            }

            ++field11654;
            break;
         }

      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field11663[6] + arg0 + ',' + (arg1 != null ? field11663[2] : field11663[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(IIII)V",
      line = 37
   )
   public static final void method5771(int arg0, int arg1, int arg2, int arg3) {
      boolean var4 = client.field1786;

      try {
         ++field11652;
         int var5 = class120.field1694 + arg1;
         int var6 = class119.field1606 + arg2;
         if (class711.field10694 != null && arg1 >= 0 && ~arg2 <= -1 && class513.field7828 > arg1 && arg2 < class475.field7230) {
            if (arg0 != -19718) {
               method5773(4, 50, 65);
            }

            if (class687.field10213.field536.method5531(arg0 ^ -480086691) != 0 || class476.field7251.field1506 == arg3) {
               long var7 = (long)(var5 | var6 << 14 | arg3 << 28);
               class535 var9 = (class535)class429.field6620.method3141(var7, true);
               if (var9 == null) {
                  class423.method3354(arg3, arg1, arg2);
               } else {
                  class281 var10 = (class281)var9.field8105.method4972((byte)-84);
                  if (var10 == null) {
                     class423.method3354(arg3, arg1, arg2);
                  } else {
                     class707 var11;
                     label89: {
                        var11 = (class707)class423.method3354(arg3, arg1, arg2);
                        if (var11 == null) {
                           var11 = new class707(arg1 << 9, class385.field6076[arg3].method2313(0, arg1, arg2), arg2 << 9, arg3, arg3);
                           if (!var4) {
                              break label89;
                           }
                        }

                        var11.field10654 = var11.field10635 = -1;
                     }

                     var11.field10651 = var10.field4474;
                     var11.field10653 = var10.field4467;

                     int var10000;
                     int var10001;
                     label83:
                     while(true) {
                        class281 var12 = (class281)var9.field8105.method4975((byte)93);
                        if (var12 != null) {
                           label106: {
                              var10000 = var11.field10651;
                              var10001 = var12.field4474;
                              if (var4) {
                                 break;
                              }

                              if (var10000 != var10001) {
                                 var11.field10657 = var12.field4467;
                                 var11.field10654 = var12.field4474;

                                 do {
                                    class281 var13;
                                    do {
                                       do {
                                          var13 = (class281)var9.field8105.method4975((byte)120);
                                          if (var13 == null) {
                                             break label106;
                                          }
                                       } while(var11.field10651 == var13.field4474);

                                       var10000 = var13.field4474;
                                       var10001 = var11.field10654;
                                       if (var4) {
                                          break label83;
                                       }
                                    } while(var10000 == var10001 && !var4);

                                    var11.field10635 = var13.field4474;
                                    var11.field10658 = var13.field4467;
                                 } while(!var4);
                              }

                              if (!var4) {
                                 continue;
                              }
                           }
                        }

                        var10000 = arg3;
                        var10001 = (arg1 << 9) + 256;
                        break;
                     }

                     int var14 = class477.method3711(var10000, var10001, (byte)0, (arg2 << 9) + 256);
                     var11.field1505 = arg1 << 9;
                     var11.field1506 = (byte)arg3;
                     var11.field1500 = (byte)arg3;
                     var11.field10641 = 0;
                     var11.field1495 = var14;
                     var11.field1494 = arg2 << 9;
                     if (class577.method4326(arg1, (byte)77, arg2)) {
                        ++var11.field1500;
                     }

                     class713.method5288(arg3, arg1, arg2, var14, var11);
                  }
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field11663[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(B)V",
      line = 136
   )
   public static void method5772(byte arg0) {
      try {
         field11661 = null;
         if (arg0 >= -31) {
            field11645 = 104;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11663[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(III)Z",
      line = 151
   )
   public static final boolean method5773(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != -9358) {
            field11645 = -123;
         }

         ++field11656;
         return (arg0 & 393216) != 0 | class290.method2449(28, arg2, arg0) || class246.method2092((byte)-40, arg2, arg0) || class95.method943(arg0, arg2, true);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11663[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(IILica;)V",
      line = 172
   )
   private final void method5774(int arg0, int arg1, class354 arg2) {
      try {
         if (arg0 != 14381) {
            this.field11647 = 25;
         }

         ++field11662;
         if (~arg1 == -2) {
            this.field11653 = arg2.method2848(-115);
         } else if (arg1 == 2) {
            this.field11648 = true;
         } else if (arg1 != 3) {
            if (~arg1 == -5) {
               this.field11658 = arg2.method2855(-31007);
            } else if (~arg1 != -6) {
               if (arg1 != 6) {
                  if (~arg1 == -8) {
                     this.field11646 = arg2.method2869(false);
                     this.field11655 = arg2.method2869(false);
                     this.field11650 = arg2.method2869(false);
                     return;
                  }
               } else {
                  this.field11660 = arg2.method2872(2);
               }

            } else {
               this.field11651 = arg2.method2848(-92);
            }
         } else {
            this.field11659 = arg2.method2869(false);
            this.field11649 = arg2.method2869(false);
            this.field11647 = arg2.method2869(false);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11663[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11663[2] : field11663[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5775(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5776(char[] arg0) {
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
            var10005 = 115;
            break;
         case 2:
            var10005 = 18;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
