import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class755 extends class644 {
   @OriginalMember(
      owner = "client!lb",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11064 = new String[]{method5472(method5471("\u0015Ez\u0006\u001a")), method5472(method5471("\u0002\tzjO")), method5472(method5471("\u0000\u001e8D")), method5472(method5471("\u0002\tzmO")), method5472(method5471("\u0002\tzkO")), method5472(method5471("\u0002\tziO"))};
   @OriginalMember(
      owner = "client!lb",
      name = "E",
      descriptor = "Lse;"
   )
   public static class6 field11057;
   @OriginalMember(
      owner = "client!lb",
      name = "C",
      descriptor = "B"
   )
   private byte field11054;
   @OriginalMember(
      owner = "client!lb",
      name = "s",
      descriptor = "B"
   )
   private byte field11058;
   @OriginalMember(
      owner = "client!lb",
      name = "z",
      descriptor = "B"
   )
   private byte field11059;
   @OriginalMember(
      owner = "client!lb",
      name = "w",
      descriptor = "B"
   )
   private byte field11060;
   @OriginalMember(
      owner = "client!lb",
      name = "u",
      descriptor = "I"
   )
   public static int field11052;
   @OriginalMember(
      owner = "client!lb",
      name = "y",
      descriptor = "I"
   )
   public static int field11055;
   @OriginalMember(
      owner = "client!lb",
      name = "B",
      descriptor = "I"
   )
   public static int field11056;
   @OriginalMember(
      owner = "client!lb",
      name = "x",
      descriptor = "Lww;"
   )
   public static class339 field11061;
   @OriginalMember(
      owner = "client!lb",
      name = "v",
      descriptor = "Z"
   )
   private boolean field11053;
   @OriginalMember(
      owner = "client!lb",
      name = "t",
      descriptor = "[[S"
   )
   public static short[][] field11062;
   @OriginalMember(
      owner = "client!lb",
      name = "A",
      descriptor = "[[[B"
   )
   public static byte[][][] field11063;

   @OriginalMember(
      owner = "client!lb",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   public final void method111(int arg0, class66 arg1) {
      try {
         ++field11056;
         this.field11053 = ~arg1.method640(255) == -2;
         this.field11059 = arg1.method628((byte)-12);
         this.field11054 = arg1.method628((byte)-12);
         this.field11060 = arg1.method628((byte)-12);
         this.field11058 = arg1.method628((byte)-12);
         if (arg0 != 11) {
            method5469(44);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11064[3] + arg0 + ',' + (arg1 != null ? field11064[0] : field11064[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lb",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method5469(int arg0) {
      try {
         if (arg0 != 1) {
            method5470((byte)105);
         }

         field11063 = null;
         field11061 = null;
         field11057 = null;
         field11062 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11064[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lb",
      name = "a",
      descriptor = "(ILkd;)V"
   )
   public final void method114(int arg0, class790 arg1) {
      try {
         arg1.field11556 = this.field11054;
         arg1.field11519 = this.field11058;
         arg1.field11525 = this.field11059;
         ++field11055;
         arg1.field11530 = this.field11053;
         arg1.field11518 = this.field11060;
         if (arg0 != 19163) {
            field11061 = null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11064[1] + arg0 + ',' + (arg1 != null ? field11064[0] : field11064[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lb",
      name = "a",
      descriptor = "(B)Z"
   )
   public static final boolean method5470(byte arg0) {
      boolean var1 = client.field1481;

      try {
         ++field11052;

         try {
            if (~class533.field7825 == -3) {
               if (class131.field1677 == null) {
                  class131.field1677 = class257.method2078(class471.field6491, class204.field2599, class131.field1682);
                  if (class131.field1677 == null) {
                     return false;
                  }
               }

               if (class424.field5777 == null) {
                  class424.field5777 = new class149(class227.field2844, class668.field9907);
               }

               class706 var2 = class98.field1305;
               if (class176.field2274 != null) {
                  var2 = class176.field2274;
               }

               if (var2.method5138(22050, true, class131.field1677, class424.field5777, class562.field8267)) {
                  class98.field1305 = var2;
                  class98.field1305.method5145(false);
                  class706 var10000;
                  int var3;
                  if (class704.field10292 <= 0) {
                     class533.field7825 = 0;
                     class98.field1305.method5157(class624.field9229, (byte)-50);
                     var3 = 0;
                     if (var1) {
                        class98.field1305.method5147(var3, class259.field3298[var3], (byte)117);
                        class259.field3298[var3] = 255;
                        ++var3;
                     }

                     while(true) {
                        while(~var3 > ~class259.field3298.length) {
                           class98.field1305.method5147(var3, class259.field3298[var3], (byte)117);
                           class259.field3298[var3] = 255;
                           ++var3;
                        }

                        if (!var1) {
                           if (var1) {
                              class533.field7825 = 3;
                              class98.field1305.method5157(class624.field9229 >= class704.field10292 ? class704.field10292 : class624.field9229, (byte)-36);
                              var3 = 0;
                              if (var1) {
                                 class98.field1305.method5147(var3, class259.field3298[var3], (byte)120);
                                 class259.field3298[var3] = 255;
                                 ++var3;
                              }
                           } else {
                              var10000 = class176.field2274;
                              if (!var1) {
                                 if (var10000 == null) {
                                    label173: {
                                       if (class513.field7157 > 0L) {
                                          class98.field1305.method5134(class131.field1677, false, class513.field7157, true, class746.field10895);
                                          if (!var1) {
                                             break label173;
                                          }
                                       }

                                       class98.field1305.method5153(class131.field1677, class746.field10895, (byte)70);
                                    }
                                 }

                                 if (class448.field6070 != null) {
                                    class448.field6070.method4405(class98.field1305, 32);
                                 }

                                 class471.field6491 = null;
                                 class131.field1677 = null;
                                 class424.field5777 = null;
                                 class513.field7157 = 0L;
                                 class176.field2274 = null;
                                 return true;
                              }

                              var10000.method5147(var3, class259.field3298[var3], (byte)120);
                              class259.field3298[var3] = 255;
                              ++var3;
                           }
                           break;
                        }

                        ++var3;
                     }
                  } else {
                     class533.field7825 = 3;
                     class98.field1305.method5157(class624.field9229 >= class704.field10292 ? class704.field10292 : class624.field9229, (byte)-36);
                     var3 = 0;
                     if (var1) {
                        class98.field1305.method5147(var3, class259.field3298[var3], (byte)120);
                        class259.field3298[var3] = 255;
                        ++var3;
                     }
                  }

                  while(true) {
                     while(var3 < class259.field3298.length) {
                        class98.field1305.method5147(var3, class259.field3298[var3], (byte)120);
                        class259.field3298[var3] = 255;
                        ++var3;
                     }

                     var10000 = class176.field2274;
                     if (!var1) {
                        if (var10000 == null) {
                           label176: {
                              if (class513.field7157 > 0L) {
                                 class98.field1305.method5134(class131.field1677, false, class513.field7157, true, class746.field10895);
                                 if (!var1) {
                                    break label176;
                                 }
                              }

                              class98.field1305.method5153(class131.field1677, class746.field10895, (byte)70);
                           }
                        }

                        if (class448.field6070 != null) {
                           class448.field6070.method4405(class98.field1305, 32);
                        }

                        class471.field6491 = null;
                        class131.field1677 = null;
                        class424.field5777 = null;
                        class513.field7157 = 0L;
                        class176.field2274 = null;
                        return true;
                     }

                     var10000.method5147(var3, class259.field3298[var3], (byte)120);
                     class259.field3298[var3] = 255;
                     ++var3;
                  }
               }
            }
         } catch (Exception var7) {
            var7.printStackTrace();
            class98.field1305.method5161(91);
            class424.field5777 = null;
            class176.field2274 = null;
            class533.field7825 = 0;
            class131.field1677 = null;
            class471.field6491 = null;
         }

         int var5 = 0 % ((arg0 - -39) / 58);
         return false;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field11064[4] + arg0 + ')');
      }
   }

   static {
      new class292("", 76);
      field11057 = new class6(79, 3);
   }

   @OriginalMember(
      owner = "client!lb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5471(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5472(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
