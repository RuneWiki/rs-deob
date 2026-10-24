package deob;

@ObfuscatedName("TJMGSZMW")
public class TJMGSZMW {

	@ObfuscatedName("TJMGSZMW.f")
	public int field1291 = 0;

	@ObfuscatedName("TJMGSZMW.g")
	public int field1292 = 0;

	@ObfuscatedName("TJMGSZMW.h")
	public int field1293;

	@ObfuscatedName("TJMGSZMW.i")
	public int field1294;

	@ObfuscatedName("TJMGSZMW.j")
	public int[][] field1295;

	public TJMGSZMW(int arg0, int arg1) {
		field1293 = arg0;
		field1294 = arg1;
		field1295 = new int[field1293][field1294];
		method480();
	}

	@ObfuscatedName("TJMGSZMW.a()V")
	public void method480() {
		for (int var1 = 0; var1 < field1293; var1++) {
			for (int var2 = 0; var2 < field1294; var2++) {
				if (var1 == 0 || var2 == 0 || field1293 - 1 == var1 || field1294 - 1 == var2) {
					field1295[var1][var2] = 0xFFFFFF;
				} else {
					field1295[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("TJMGSZMW.a(IZIZII)V")
	public void method481(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg4 -= field1291;
		arg3 -= field1292;
		if (arg2 == 0) {
			if (arg0 == 0) {
				method484(arg4, arg3, 128);
				method484(arg4 - 1, arg3, 8);
			}

			if (arg0 == 1) {
				method484(arg4, arg3, 2);
				method484(arg4, arg3 + 1, 32);
			}

			if (arg0 == 2) {
				method484(arg4, arg3, 8);
				method484(arg4 + 1, arg3, 128);
			}

			if (arg0 == 3) {
				method484(arg4, arg3, 32);
				method484(arg4, arg3 - 1, 2);
			}
		}

		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				method484(arg4, arg3, 1);
				method484(arg4 - 1, arg3 + 1, 16);
			}

			if (arg0 == 1) {
				method484(arg4, arg3, 4);
				method484(arg4 + 1, arg3 + 1, 64);
			}

			if (arg0 == 2) {
				method484(arg4, arg3, 16);
				method484(arg4 + 1, arg3 - 1, 1);
			}

			if (arg0 == 3) {
				method484(arg4, arg3, 64);
				method484(arg4 - 1, arg3 - 1, 4);
			}
		}

		if (arg2 == 2) {
			if (arg0 == 0) {
				method484(arg4, arg3, 130);
				method484(arg4 - 1, arg3, 8);
				method484(arg4, arg3 + 1, 32);
			}

			if (arg0 == 1) {
				method484(arg4, arg3, 10);
				method484(arg4, arg3 + 1, 32);
				method484(arg4 + 1, arg3, 128);
			}

			if (arg0 == 2) {
				method484(arg4, arg3, 40);
				method484(arg4 + 1, arg3, 128);
				method484(arg4, arg3 - 1, 2);
			}

			if (arg0 == 3) {
				method484(arg4, arg3, 160);
				method484(arg4, arg3 - 1, 2);
				method484(arg4 - 1, arg3, 8);
			}
		}

		if (arg1) {
			if (arg2 == 0) {
				if (arg0 == 0) {
					method484(arg4, arg3, 0x10000);
					method484(arg4 - 1, arg3, 4096);
				}

				if (arg0 == 1) {
					method484(arg4, arg3, 1024);
					method484(arg4, arg3 + 1, 16384);
				}

				if (arg0 == 2) {
					method484(arg4, arg3, 4096);
					method484(arg4 + 1, arg3, 0x10000);
				}

				if (arg0 == 3) {
					method484(arg4, arg3, 16384);
					method484(arg4, arg3 - 1, 1024);
				}
			}

			if (arg2 == 1 || arg2 == 3) {
				if (arg0 == 0) {
					method484(arg4, arg3, 512);
					method484(arg4 - 1, arg3 + 1, 8192);
				}

				if (arg0 == 1) {
					method484(arg4, arg3, 2048);
					method484(arg4 + 1, arg3 + 1, 32768);
				}

				if (arg0 == 2) {
					method484(arg4, arg3, 8192);
					method484(arg4 + 1, arg3 - 1, 512);
				}

				if (arg0 == 3) {
					method484(arg4, arg3, 32768);
					method484(arg4 - 1, arg3 - 1, 2048);
				}
			}

			if (arg2 == 2) {
				if (arg0 == 0) {
					method484(arg4, arg3, 66560);
					method484(arg4 - 1, arg3, 4096);
					method484(arg4, arg3 + 1, 16384);
				}

				if (arg0 == 1) {
					method484(arg4, arg3, 5120);
					method484(arg4, arg3 + 1, 16384);
					method484(arg4 + 1, arg3, 0x10000);
				}

				if (arg0 == 2) {
					method484(arg4, arg3, 20480);
					method484(arg4 + 1, arg3, 0x10000);
					method484(arg4, arg3 - 1, 1024);
				}

				if (arg0 == 3) {
					method484(arg4, arg3, 81920);
					method484(arg4, arg3 - 1, 1024);
					method484(arg4 - 1, arg3, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("TJMGSZMW.a(IIIZIII)V")
	public void method482(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg3) {
			var7 += 0x20000;
		}

		arg0 -= field1291;
		arg1 -= field1292;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg5;
			arg5 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg0; var9 < arg0 + arg5; var9++) {
			if (var9 >= 0 && var9 < field1293) {
				for (int var10 = arg1; var10 < arg1 + arg2; var10++) {
					if (var10 >= 0 && var10 < field1294) {
						method484(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("TJMGSZMW.a(III)V")
	public void method483(int arg0, int arg1) {
		arg0 -= field1291;
		arg1 -= field1292;
		field1295[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("TJMGSZMW.b(III)V")
	public void method484(int arg0, int arg1, int arg2) {
		field1295[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("TJMGSZMW.a(IIZIII)V")
	public void method485(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg2 -= field1291;
		arg3 -= field1292;
		if (arg0 == 0) {
			if (arg4 == 0) {
				method487(128, arg2, arg3);
				method487(8, arg2 - 1, arg3);
			}

			if (arg4 == 1) {
				method487(2, arg2, arg3);
				method487(32, arg2, arg3 + 1);
			}

			if (arg4 == 2) {
				method487(8, arg2, arg3);
				method487(128, arg2 + 1, arg3);
			}

			if (arg4 == 3) {
				method487(32, arg2, arg3);
				method487(2, arg2, arg3 - 1);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				method487(1, arg2, arg3);
				method487(16, arg2 - 1, arg3 + 1);
			}

			if (arg4 == 1) {
				method487(4, arg2, arg3);
				method487(64, arg2 + 1, arg3 + 1);
			}

			if (arg4 == 2) {
				method487(16, arg2, arg3);
				method487(1, arg2 + 1, arg3 - 1);
			}

			if (arg4 == 3) {
				method487(64, arg2, arg3);
				method487(4, arg2 - 1, arg3 - 1);
			}
		}

		if (arg0 == 2) {
			if (arg4 == 0) {
				method487(130, arg2, arg3);
				method487(8, arg2 - 1, arg3);
				method487(32, arg2, arg3 + 1);
			}

			if (arg4 == 1) {
				method487(10, arg2, arg3);
				method487(32, arg2, arg3 + 1);
				method487(128, arg2 + 1, arg3);
			}

			if (arg4 == 2) {
				method487(40, arg2, arg3);
				method487(128, arg2 + 1, arg3);
				method487(2, arg2, arg3 - 1);
			}

			if (arg4 == 3) {
				method487(160, arg2, arg3);
				method487(2, arg2, arg3 - 1);
				method487(8, arg2 - 1, arg3);
			}
		}

		if (arg1) {
			if (arg0 == 0) {
				if (arg4 == 0) {
					method487(0x10000, arg2, arg3);
					method487(4096, arg2 - 1, arg3);
				}

				if (arg4 == 1) {
					method487(1024, arg2, arg3);
					method487(16384, arg2, arg3 + 1);
				}

				if (arg4 == 2) {
					method487(4096, arg2, arg3);
					method487(0x10000, arg2 + 1, arg3);
				}

				if (arg4 == 3) {
					method487(16384, arg2, arg3);
					method487(1024, arg2, arg3 - 1);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg4 == 0) {
					method487(512, arg2, arg3);
					method487(8192, arg2 - 1, arg3 + 1);
				}

				if (arg4 == 1) {
					method487(2048, arg2, arg3);
					method487(32768, arg2 + 1, arg3 + 1);
				}

				if (arg4 == 2) {
					method487(8192, arg2, arg3);
					method487(512, arg2 + 1, arg3 - 1);
				}

				if (arg4 == 3) {
					method487(32768, arg2, arg3);
					method487(2048, arg2 - 1, arg3 - 1);
				}
			}

			if (arg0 == 2) {
				if (arg4 == 0) {
					method487(66560, arg2, arg3);
					method487(4096, arg2 - 1, arg3);
					method487(16384, arg2, arg3 + 1);
				}

				if (arg4 == 1) {
					method487(5120, arg2, arg3);
					method487(16384, arg2, arg3 + 1);
					method487(0x10000, arg2 + 1, arg3);
				}

				if (arg4 == 2) {
					method487(20480, arg2, arg3);
					method487(0x10000, arg2 + 1, arg3);
					method487(1024, arg2, arg3 - 1);
				}

				if (arg4 == 3) {
					method487(81920, arg2, arg3);
					method487(1024, arg2, arg3 - 1);
					method487(4096, arg2 - 1, arg3);
					return;
				}
			}
		}
	}

	@ObfuscatedName("TJMGSZMW.a(IZBIIII)V")
	public void method486(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg1) {
			var7 += 0x20000;
		}

		arg0 -= field1291;
		arg2 -= field1292;

		if (arg5 == 1 || arg5 == 3) {
			int var8 = arg3;
			arg3 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg0; var9 < arg0 + arg3; var9++) {
			if (var9 >= 0 && var9 < field1293) {
				for (int var10 = arg2; var10 < arg2 + arg4; var10++) {
					if (var10 >= 0 && var10 < field1294) {
						method487(var7, var9, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("TJMGSZMW.a(IIII)V")
	public void method487(int arg0, int arg1, int arg2) {
		field1295[arg1][arg2] &= 0xFFFFFF - arg0;
	}

	@ObfuscatedName("TJMGSZMW.a(BII)V")
	public void method488(int arg0, int arg1) {
		arg0 -= field1291;
		arg1 -= field1292;
		field1295[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("TJMGSZMW.a(IIIIIII)Z")
	public boolean method489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg2 && arg3 == arg4) {
			return true;
		}

		arg1 -= field1291;
		arg4 -= field1292;
		arg2 -= field1291;
		arg3 -= field1292;
		if (arg0 == 0) {
			if (arg5 == 0) {
				if (arg2 - 1 == arg1 && arg3 == arg4) {
					return true;
				}

				if (arg1 == arg2 && arg3 + 1 == arg4 && (field1295[arg1][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg3 - 1 == arg4 && (field1295[arg1][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg1 == arg2 && arg3 + 1 == arg4) {
					return true;
				}

				if (arg2 - 1 == arg1 && arg3 == arg4 && (field1295[arg1][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 + 1 == arg1 && arg3 == arg4 && (field1295[arg1][arg4] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg2 + 1 == arg1 && arg3 == arg4) {
					return true;
				}

				if (arg1 == arg2 && arg3 + 1 == arg4 && (field1295[arg1][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg3 - 1 == arg4 && (field1295[arg1][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg1 == arg2 && arg3 - 1 == arg4) {
					return true;
				}

				if (arg2 - 1 == arg1 && arg3 == arg4 && (field1295[arg1][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 + 1 == arg1 && arg3 == arg4 && (field1295[arg1][arg4] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 2) {
			if (arg5 == 0) {
				if (arg2 - 1 == arg1 && arg3 == arg4) {
					return true;
				}

				if (arg1 == arg2 && arg3 + 1 == arg4) {
					return true;
				}

				if (arg2 + 1 == arg1 && arg3 == arg4 && (field1295[arg1][arg4] & 0x1280180) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg3 - 1 == arg4 && (field1295[arg1][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg2 - 1 == arg1 && arg3 == arg4 && (field1295[arg1][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg3 + 1 == arg4) {
					return true;
				}

				if (arg2 + 1 == arg1 && arg3 == arg4) {
					return true;
				}

				if (arg1 == arg2 && arg3 - 1 == arg4 && (field1295[arg1][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg2 - 1 == arg1 && arg3 == arg4 && (field1295[arg1][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg3 + 1 == arg4 && (field1295[arg1][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 + 1 == arg1 && arg3 == arg4) {
					return true;
				}

				if (arg1 == arg2 && arg3 - 1 == arg4) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg2 - 1 == arg1 && arg3 == arg4) {
					return true;
				}

				if (arg1 == arg2 && arg3 + 1 == arg4 && (field1295[arg1][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 + 1 == arg1 && arg3 == arg4 && (field1295[arg1][arg4] & 0x1280180) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg3 - 1 == arg4) {
					return true;
				}
			}
		}

		if (arg0 == 9) {
			if (arg1 == arg2 && arg3 + 1 == arg4 && (field1295[arg1][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg2 && arg3 - 1 == arg4 && (field1295[arg1][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg2 - 1 == arg1 && arg3 == arg4 && (field1295[arg1][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg2 + 1 == arg1 && arg3 == arg4 && (field1295[arg1][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("TJMGSZMW.b(IIIIIII)Z")
	public boolean method490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg4 && arg2 == arg5) {
			return true;
		}

		arg3 -= field1291;
		arg2 -= field1292;
		arg4 -= field1291;
		arg5 -= field1292;
		if (arg1 == 6 || arg1 == 7) {
			if (arg1 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}

			if (arg0 == 0) {
				if (arg4 + 1 == arg3 && arg2 == arg5 && (field1295[arg3][arg2] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg5 - 1 == arg2 && (field1295[arg3][arg2] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg4 - 1 == arg3 && arg2 == arg5 && (field1295[arg3][arg2] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg5 - 1 == arg2 && (field1295[arg3][arg2] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg4 - 1 == arg3 && arg2 == arg5 && (field1295[arg3][arg2] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg5 + 1 == arg2 && (field1295[arg3][arg2] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg4 + 1 == arg3 && arg2 == arg5 && (field1295[arg3][arg2] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg5 + 1 == arg2 && (field1295[arg3][arg2] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg1 == 8) {
			if (arg3 == arg4 && arg5 + 1 == arg2 && (field1295[arg3][arg2] & 0x20) == 0) {
				return true;
			}

			if (arg3 == arg4 && arg5 - 1 == arg2 && (field1295[arg3][arg2] & 0x2) == 0) {
				return true;
			}

			if (arg4 - 1 == arg3 && arg2 == arg5 && (field1295[arg3][arg2] & 0x8) == 0) {
				return true;
			}

			if (arg4 + 1 == arg3 && arg2 == arg5 && (field1295[arg3][arg2] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("TJMGSZMW.a(IIIIBIII)Z")
	public boolean method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg4 + arg5 - 1;
		int var9 = arg1 + arg2 - 1;
		if (arg6 >= arg4 && arg6 <= var8 && arg0 >= arg1 && arg0 <= var9) {
			return true;
		}

		if (arg4 - 1 == arg6 && arg0 >= arg1 && arg0 <= var9 && (field1295[arg6 - field1291][arg0 - field1292] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg6 && arg0 >= arg1 && arg0 <= var9 && (field1295[arg6 - field1291][arg0 - field1292] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		}

		if (arg1 - 1 == arg0 && arg6 >= arg4 && arg6 <= var8 && (field1295[arg6 - field1291][arg0 - field1292] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg0 && arg6 >= arg4 && arg6 <= var8 && (field1295[arg6 - field1291][arg0 - field1292] & 0x20) == 0 && (arg3 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
