package deob;

@ObfuscatedName("ZGDLGUZR")
public class ZGDLGUZR {

	@ObfuscatedName("ZGDLGUZR.e")
	public int field1514 = 0;

	@ObfuscatedName("ZGDLGUZR.f")
	public int field1515 = 0;

	@ObfuscatedName("ZGDLGUZR.g")
	public int field1516;

	@ObfuscatedName("ZGDLGUZR.h")
	public int field1517;

	@ObfuscatedName("ZGDLGUZR.i")
	public int[][] field1518;

	public ZGDLGUZR(int arg0, int arg1) {
		field1516 = arg1;
		field1517 = arg0;
		field1518 = new int[field1516][field1517];
		method593();
	}

	@ObfuscatedName("ZGDLGUZR.a()V")
	public void method593() {
		for (int var1 = 0; var1 < field1516; var1++) {
			for (int var2 = 0; var2 < field1517; var2++) {
				if (var1 == 0 || var2 == 0 || field1516 - 1 == var1 || field1517 - 1 == var2) {
					field1518[var1][var2] = 0xFFFFFF;
				} else {
					field1518[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("ZGDLGUZR.a(IZIIBI)V")
	public void method594(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg0 -= field1514;
		arg4 -= field1515;
		if (arg3 == 0) {
			if (arg2 == 0) {
				method597(arg0, arg4, 128);
				method597(arg0 - 1, arg4, 8);
			}

			if (arg2 == 1) {
				method597(arg0, arg4, 2);
				method597(arg0, arg4 + 1, 32);
			}

			if (arg2 == 2) {
				method597(arg0, arg4, 8);
				method597(arg0 + 1, arg4, 128);
			}

			if (arg2 == 3) {
				method597(arg0, arg4, 32);
				method597(arg0, arg4 - 1, 2);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				method597(arg0, arg4, 1);
				method597(arg0 - 1, arg4 + 1, 16);
			}

			if (arg2 == 1) {
				method597(arg0, arg4, 4);
				method597(arg0 + 1, arg4 + 1, 64);
			}

			if (arg2 == 2) {
				method597(arg0, arg4, 16);
				method597(arg0 + 1, arg4 - 1, 1);
			}

			if (arg2 == 3) {
				method597(arg0, arg4, 64);
				method597(arg0 - 1, arg4 - 1, 4);
			}
		}

		if (arg3 == 2) {
			if (arg2 == 0) {
				method597(arg0, arg4, 130);
				method597(arg0 - 1, arg4, 8);
				method597(arg0, arg4 + 1, 32);
			}

			if (arg2 == 1) {
				method597(arg0, arg4, 10);
				method597(arg0, arg4 + 1, 32);
				method597(arg0 + 1, arg4, 128);
			}

			if (arg2 == 2) {
				method597(arg0, arg4, 40);
				method597(arg0 + 1, arg4, 128);
				method597(arg0, arg4 - 1, 2);
			}

			if (arg2 == 3) {
				method597(arg0, arg4, 160);
				method597(arg0, arg4 - 1, 2);
				method597(arg0 - 1, arg4, 8);
			}
		}

		if (arg1) {
			if (arg3 == 0) {
				if (arg2 == 0) {
					method597(arg0, arg4, 0x10000);
					method597(arg0 - 1, arg4, 4096);
				}

				if (arg2 == 1) {
					method597(arg0, arg4, 1024);
					method597(arg0, arg4 + 1, 16384);
				}

				if (arg2 == 2) {
					method597(arg0, arg4, 4096);
					method597(arg0 + 1, arg4, 0x10000);
				}

				if (arg2 == 3) {
					method597(arg0, arg4, 16384);
					method597(arg0, arg4 - 1, 1024);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg2 == 0) {
					method597(arg0, arg4, 512);
					method597(arg0 - 1, arg4 + 1, 8192);
				}

				if (arg2 == 1) {
					method597(arg0, arg4, 2048);
					method597(arg0 + 1, arg4 + 1, 32768);
				}

				if (arg2 == 2) {
					method597(arg0, arg4, 8192);
					method597(arg0 + 1, arg4 - 1, 512);
				}

				if (arg2 == 3) {
					method597(arg0, arg4, 32768);
					method597(arg0 - 1, arg4 - 1, 2048);
				}
			}

			if (arg3 == 2) {
				if (arg2 == 0) {
					method597(arg0, arg4, 66560);
					method597(arg0 - 1, arg4, 4096);
					method597(arg0, arg4 + 1, 16384);
				}

				if (arg2 == 1) {
					method597(arg0, arg4, 5120);
					method597(arg0, arg4 + 1, 16384);
					method597(arg0 + 1, arg4, 0x10000);
				}

				if (arg2 == 2) {
					method597(arg0, arg4, 20480);
					method597(arg0 + 1, arg4, 0x10000);
					method597(arg0, arg4 - 1, 1024);
				}

				if (arg2 == 3) {
					method597(arg0, arg4, 81920);
					method597(arg0, arg4 - 1, 1024);
					method597(arg0 - 1, arg4, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ZGDLGUZR.a(ZIBIIII)V")
	public void method595(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg0) {
			var7 += 0x20000;
		}

		arg5 -= field1514;
		arg4 -= field1515;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg1;
			arg1 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg5; var9 < arg1 + arg5; var9++) {
			if (var9 >= 0 && var9 < field1516) {
				for (int var10 = arg4; var10 < arg3 + arg4; var10++) {
					if (var10 >= 0 && var10 < field1517) {
						method597(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("ZGDLGUZR.a(III)V")
	public void method596(int arg0, int arg1) {
		arg0 -= field1514;
		arg1 -= field1515;
		field1518[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("ZGDLGUZR.b(III)V")
	public void method597(int arg0, int arg1, int arg2) {
		field1518[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("ZGDLGUZR.a(IIZBII)V")
	public void method598(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg3 -= field1514;
		arg0 -= field1515;
		if (arg1 == 0) {
			if (arg4 == 0) {
				method600(arg3, arg0, 128);
				method600(arg3 - 1, arg0, 8);
			}

			if (arg4 == 1) {
				method600(arg3, arg0, 2);
				method600(arg3, arg0 + 1, 32);
			}

			if (arg4 == 2) {
				method600(arg3, arg0, 8);
				method600(arg3 + 1, arg0, 128);
			}

			if (arg4 == 3) {
				method600(arg3, arg0, 32);
				method600(arg3, arg0 - 1, 2);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				method600(arg3, arg0, 1);
				method600(arg3 - 1, arg0 + 1, 16);
			}

			if (arg4 == 1) {
				method600(arg3, arg0, 4);
				method600(arg3 + 1, arg0 + 1, 64);
			}

			if (arg4 == 2) {
				method600(arg3, arg0, 16);
				method600(arg3 + 1, arg0 - 1, 1);
			}

			if (arg4 == 3) {
				method600(arg3, arg0, 64);
				method600(arg3 - 1, arg0 - 1, 4);
			}
		}

		if (arg1 == 2) {
			if (arg4 == 0) {
				method600(arg3, arg0, 130);
				method600(arg3 - 1, arg0, 8);
				method600(arg3, arg0 + 1, 32);
			}

			if (arg4 == 1) {
				method600(arg3, arg0, 10);
				method600(arg3, arg0 + 1, 32);
				method600(arg3 + 1, arg0, 128);
			}

			if (arg4 == 2) {
				method600(arg3, arg0, 40);
				method600(arg3 + 1, arg0, 128);
				method600(arg3, arg0 - 1, 2);
			}

			if (arg4 == 3) {
				method600(arg3, arg0, 160);
				method600(arg3, arg0 - 1, 2);
				method600(arg3 - 1, arg0, 8);
			}
		}

		if (arg2) {
			if (arg1 == 0) {
				if (arg4 == 0) {
					method600(arg3, arg0, 0x10000);
					method600(arg3 - 1, arg0, 4096);
				}

				if (arg4 == 1) {
					method600(arg3, arg0, 1024);
					method600(arg3, arg0 + 1, 16384);
				}

				if (arg4 == 2) {
					method600(arg3, arg0, 4096);
					method600(arg3 + 1, arg0, 0x10000);
				}

				if (arg4 == 3) {
					method600(arg3, arg0, 16384);
					method600(arg3, arg0 - 1, 1024);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg4 == 0) {
					method600(arg3, arg0, 512);
					method600(arg3 - 1, arg0 + 1, 8192);
				}

				if (arg4 == 1) {
					method600(arg3, arg0, 2048);
					method600(arg3 + 1, arg0 + 1, 32768);
				}

				if (arg4 == 2) {
					method600(arg3, arg0, 8192);
					method600(arg3 + 1, arg0 - 1, 512);
				}

				if (arg4 == 3) {
					method600(arg3, arg0, 32768);
					method600(arg3 - 1, arg0 - 1, 2048);
				}
			}

			if (arg1 == 2) {
				if (arg4 == 0) {
					method600(arg3, arg0, 66560);
					method600(arg3 - 1, arg0, 4096);
					method600(arg3, arg0 + 1, 16384);
				}

				if (arg4 == 1) {
					method600(arg3, arg0, 5120);
					method600(arg3, arg0 + 1, 16384);
					method600(arg3 + 1, arg0, 0x10000);
				}

				if (arg4 == 2) {
					method600(arg3, arg0, 20480);
					method600(arg3 + 1, arg0, 0x10000);
					method600(arg3, arg0 - 1, 1024);
				}

				if (arg4 == 3) {
					method600(arg3, arg0, 81920);
					method600(arg3, arg0 - 1, 1024);
					method600(arg3 - 1, arg0, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ZGDLGUZR.a(ZIIIIII)V")
	public void method599(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg0) {
			var7 += 0x20000;
		}

		arg3 -= field1514;
		arg5 -= field1515;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg4;
			arg4 = arg1;
			arg1 = var8;
		}

		for (int var9 = arg3; var9 < arg3 + arg4; var9++) {
			if (var9 >= 0 && var9 < field1516) {
				for (int var10 = arg5; var10 < arg1 + arg5; var10++) {
					if (var10 >= 0 && var10 < field1517) {
						method600(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("ZGDLGUZR.a(IZII)V")
	public void method600(int arg0, int arg1, int arg2) {
		field1518[arg0][arg1] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("ZGDLGUZR.c(III)V")
	public void method601(int arg0, int arg1) {
		arg1 -= field1514;
		arg0 -= field1515;
		field1518[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("ZGDLGUZR.a(IIIIIII)Z")
	public boolean method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 == arg4 && arg3 == arg5) {
			return true;
		}

		arg4 -= field1514;
		arg5 -= field1515;
		arg2 -= field1514;
		arg3 -= field1515;
		if (arg0 == 0) {
			if (arg1 == 0) {
				if (arg2 - 1 == arg4 && arg3 == arg5) {
					return true;
				}

				if (arg2 == arg4 && arg3 + 1 == arg5 && (field1518[arg4][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 == arg4 && arg3 - 1 == arg5 && (field1518[arg4][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg2 == arg4 && arg3 + 1 == arg5) {
					return true;
				}

				if (arg2 - 1 == arg4 && arg3 == arg5 && (field1518[arg4][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 + 1 == arg4 && arg3 == arg5 && (field1518[arg4][arg5] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg2 + 1 == arg4 && arg3 == arg5) {
					return true;
				}

				if (arg2 == arg4 && arg3 + 1 == arg5 && (field1518[arg4][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 == arg4 && arg3 - 1 == arg5 && (field1518[arg4][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg2 == arg4 && arg3 - 1 == arg5) {
					return true;
				}

				if (arg2 - 1 == arg4 && arg3 == arg5 && (field1518[arg4][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 + 1 == arg4 && arg3 == arg5 && (field1518[arg4][arg5] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 2) {
			if (arg1 == 0) {
				if (arg2 - 1 == arg4 && arg3 == arg5) {
					return true;
				}

				if (arg2 == arg4 && arg3 + 1 == arg5) {
					return true;
				}

				if (arg2 + 1 == arg4 && arg3 == arg5 && (field1518[arg4][arg5] & 0x1280180) == 0) {
					return true;
				}

				if (arg2 == arg4 && arg3 - 1 == arg5 && (field1518[arg4][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg2 - 1 == arg4 && arg3 == arg5 && (field1518[arg4][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 == arg4 && arg3 + 1 == arg5) {
					return true;
				}

				if (arg2 + 1 == arg4 && arg3 == arg5) {
					return true;
				}

				if (arg2 == arg4 && arg3 - 1 == arg5 && (field1518[arg4][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg2 - 1 == arg4 && arg3 == arg5 && (field1518[arg4][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 == arg4 && arg3 + 1 == arg5 && (field1518[arg4][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 + 1 == arg4 && arg3 == arg5) {
					return true;
				}

				if (arg2 == arg4 && arg3 - 1 == arg5) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg2 - 1 == arg4 && arg3 == arg5) {
					return true;
				}

				if (arg2 == arg4 && arg3 + 1 == arg5 && (field1518[arg4][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 + 1 == arg4 && arg3 == arg5 && (field1518[arg4][arg5] & 0x1280180) == 0) {
					return true;
				}

				if (arg2 == arg4 && arg3 - 1 == arg5) {
					return true;
				}
			}
		}

		if (arg0 == 9) {
			if (arg2 == arg4 && arg3 + 1 == arg5 && (field1518[arg4][arg5] & 0x20) == 0) {
				return true;
			}

			if (arg2 == arg4 && arg3 - 1 == arg5 && (field1518[arg4][arg5] & 0x2) == 0) {
				return true;
			}

			if (arg2 - 1 == arg4 && arg3 == arg5 && (field1518[arg4][arg5] & 0x8) == 0) {
				return true;
			}

			if (arg2 + 1 == arg4 && arg3 == arg5 && (field1518[arg4][arg5] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ZGDLGUZR.b(ZIIIIII)Z")
	public boolean method603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg3 && arg1 == arg4) {
			return true;
		}

		arg3 -= field1514;
		arg4 -= field1515;
		arg0 -= field1514;
		arg1 -= field1515;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg5 = arg5 + 2 & 0x3;
			}

			if (arg5 == 0) {
				if (arg0 + 1 == arg3 && arg1 == arg4 && (field1518[arg3][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg4 && (field1518[arg3][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg0 - 1 == arg3 && arg1 == arg4 && (field1518[arg3][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg4 && (field1518[arg3][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg0 - 1 == arg3 && arg1 == arg4 && (field1518[arg3][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg4 && (field1518[arg3][arg4] & 0x20) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg0 + 1 == arg3 && arg1 == arg4 && (field1518[arg3][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg4 && (field1518[arg3][arg4] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 8) {
			if (arg0 == arg3 && arg1 + 1 == arg4 && (field1518[arg3][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg3 && arg1 - 1 == arg4 && (field1518[arg3][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg3 && arg1 == arg4 && (field1518[arg3][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg3 && arg1 == arg4 && (field1518[arg3][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ZGDLGUZR.a(IZIIIIII)Z")
	public boolean method604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg5 - 1;
		int var9 = arg2 + arg6 - 1;
		if (arg3 >= arg5 && arg3 <= var8 && arg1 >= arg6 && arg1 <= var9) {
			return true;
		}

		if (arg5 - 1 == arg3 && arg1 >= arg6 && arg1 <= var9 && (field1518[arg3 - field1514][arg1 - field1515] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg3 && arg1 >= arg6 && arg1 <= var9 && (field1518[arg3 - field1514][arg1 - field1515] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		}

		if (arg6 - 1 == arg1 && arg3 >= arg5 && arg3 <= var8 && (field1518[arg3 - field1514][arg1 - field1515] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg1 && arg3 >= arg5 && arg3 <= var8 && (field1518[arg3 - field1514][arg1 - field1515] & 0x20) == 0 && (arg4 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
